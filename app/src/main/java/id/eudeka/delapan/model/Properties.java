package id.eudeka.delapan.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Properties {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("occurred_at")
    @Expose
    private String occurred_at;

    public String getId() {
        return id;
    }

    public Properties setId(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public Properties setType(String type) {
        this.type = type;
        return this;
    }

    public String getOccurred_at() {
        return occurred_at;
    }

    public Properties setOccurred_at(String occurred_at) {
        this.occurred_at = occurred_at;
        return this;
    }

}
