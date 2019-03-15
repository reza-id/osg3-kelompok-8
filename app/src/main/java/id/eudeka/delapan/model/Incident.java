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

    @SerializedName("occurred_at")
    @Expose
    private String occurred_at;

    @SerializedName("updated_at")
    @Expose
    private String updated_at;

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("media")
    @Expose
    private Media media;

    @SerializedName("location_type")
    @Expose
    private String location_type;

    @SerializedName("location_description")
    @Expose
    private String location_description;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("type_properties")
    @Expose
    private String type_properties;

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

    public String getOccurred_at() {
        return occurred_at;
    }

    public Incident setOccurred_at(String occurred_at) {
        this.occurred_at = occurred_at;
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

    public String getLocation_type() {
        return location_type;
    }

    public Incident setLocation_type(String location_type) {
        this.location_type = location_type;
        return this;
    }

    public String getLocation_description() {
        return location_description;
    }

    public Incident setLocation_description(String location_description) {
        this.location_description = location_description;
        return this;
    }

    public String getType() {
        return type;
    }

    public Incident setType(String type) {
        this.type = type;
        return this;
    }

    public String getType_properties() {
        return type_properties;
    }

    public Incident setType_properties(String type_properties) {
        this.type_properties = type_properties;
        return this;
    }

}
