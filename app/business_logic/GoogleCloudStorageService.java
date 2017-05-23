package business_logic;

import com.google.api.gax.paging.Page;
import com.google.cloud.storage.*;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import models.MediaDescriptor;
import utils.AppConstants;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Singleton
public class GoogleCloudStorageService {

    private static final String BUCKET_NAME = "flacfiles";

    private Storage storage;

    private static final String STORAGE_SCOPE = "https://www.googleapis.com/auth/devstorage.read_write";

    @Inject
    public GoogleCloudStorageService(){
        storage = StorageOptions.getDefaultInstance().getService();
    }

    public String fileUpload(String fileName, File file) throws IOException {
        String mediaLink;
        try{
            List<Acl> acls = new ArrayList<>();
            acls.add(Acl.of(Acl.User.ofAllUsers(), Acl.Role.READER));
            Blob blob = storage.create(
                            BlobInfo.newBuilder(BUCKET_NAME, fileName)
                                    .setContentType(AppConstants.WEB_FLAC_CONTENT_TYPE)
                                    .setAcl(acls).build(),
                            new FileInputStream(file));
            mediaLink = blob.getMediaLink();
            if (mediaLink == null || mediaLink.isEmpty()){
                mediaLink = AppConstants.APIResponse.FAILURE;
            }
        } catch (Exception ex){
            ex.printStackTrace();
            mediaLink = AppConstants.APIResponse.FAILURE;
        }
        return mediaLink;
    }

    public List<MediaDescriptor> getAllAudioFiles() throws IOException {
        List<MediaDescriptor> mediaDescriptors = new ArrayList<>();
        int mediaCount = 0;
        Page<Blob> bucketContents = storage.list(BUCKET_NAME);
        if (bucketContents != null) {
            Iterator<Blob> currPageValues = bucketContents.getValues().iterator();
            while (currPageValues.hasNext()) {
                Blob media = currPageValues.next();
                MediaDescriptor descriptor = new MediaDescriptor(media.getName(), ""+mediaCount, media.getMediaLink());
                mediaCount++;
                mediaDescriptors.add(descriptor);
                if (!currPageValues.hasNext()) {
                    if (bucketContents.hasNextPage()) {
                        bucketContents = bucketContents.getNextPage();
                        currPageValues = bucketContents.getValues().iterator();
                    }
                }
            }
        }
        return mediaDescriptors;
    }
}