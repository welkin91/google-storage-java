package controllers;

import business_logic.GoogleCloudStorageService;
import models.ErrorDescriptor;
import models.MediaDescriptor;
import org.jflac.sound.spi.FlacAudioFileReader;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.twirl.api.Content;
import utils.AppConstants;
import views.html.index;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Singleton
public class UploadController extends Controller {

    private final GoogleCloudStorageService googleCloudStorageService;
    private Http.Context context;

    @Inject
    public UploadController(GoogleCloudStorageService googleCloudStorageService) {
        this.googleCloudStorageService = googleCloudStorageService;
        this.context = Http.Context.current();
    }

    public Result index() throws IOException{
        return ok(index.render(null, null));
    }

    public Result upload() throws IOException {
        final play.mvc.Http.MultipartFormData formData = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart audioFile = formData.getFile(AppConstants.FILE_DESCRIPTOR);
        if (audioFile != null) {
            String fileName = audioFile.getFilename();
            String contentType = audioFile.getContentType();
            if (isFileValid(fileName, contentType, audioFile.getFile())) {
                String result = googleCloudStorageService.fileUpload(fileName, audioFile.getFile());
                if (AppConstants.APIResponse.FAILURE.equals(result)){
                    return ok(index.render(new ErrorDescriptor(400, AppConstants.APIResponse.INVALID_ARGUMENTS), null));
                }
                return ok(index.render(null,"Audio file uploaded successfully"));
            }

        }
        return ok(index.render(new ErrorDescriptor(400, AppConstants.APIResponse.INVALID_ARGUMENTS), null));
    }

    //check the name, content type and the number of audio channels
    private boolean isFileValid(String fileName, String contentType, File file){
        if (fileName != null && fileName.length() > 5){
            String ext = fileName.substring(fileName.length() - 5, fileName.length());
            if  (AppConstants.FLAC_EXT.equalsIgnoreCase(ext) && (AppConstants.WEB_FLAC_CONTENT_TYPE.equalsIgnoreCase(contentType) ||
                    AppConstants.FLAC_CONTENT_TYPE.equalsIgnoreCase(contentType))){
                try {
                    AudioFileFormat audioFileFormat = new FlacAudioFileReader().getAudioFileFormat(file);
                    return audioFileFormat.getFormat().getChannels() == 1;  //mono channel audio supported by google speech
                } catch (UnsupportedAudioFileException | IOException ex){
                    ex.printStackTrace();
                }
            }
        }
        return false;
    }

    public Result allFiles() throws IOException{
        List<MediaDescriptor> list =  googleCloudStorageService.getAllAudioFiles();
        Content html = views.html.list.render(list);
        return ok(html);
    }

}