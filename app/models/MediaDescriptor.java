package models;

public class MediaDescriptor {

    private String mediaUrl;
    private String itemName;
    private String mediaId;

    public MediaDescriptor(String name, String id, String url){
        this.itemName = name;
        this.mediaId = id;
        this.mediaUrl = url;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public String getItemName() {
        return itemName;
    }

    public String getMediaId() {
        return mediaId;
    }
}
