package id.eudeka.delapan.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Incident {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("address")
    @Expose
    private String address;

    @SerializedName("updated_at")
    @Expose
    private String updated_at;

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("media")
    @Expose
    private Media media;

    public String getId() {
        return id;
    }

    public Incident setId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Incident setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Incident setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Incident setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public Incident setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Incident setUrl(String url) {
        this.url = url;
        return this;
    }

    public Media getMedia() {
        return media;
    }

    public Incident setMedia(Media media) {
        this.media = media;
        return this;
    }

}
