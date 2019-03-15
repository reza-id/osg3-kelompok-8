package id.eudeka.delapan.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Media {

    @SerializedName("image_url")
    @Expose
    private String image_url;

    @SerializedName("image_url_thumb")
    @Expose
    private String image_url_thumb;

    public String getImage_url() {
        return image_url;
    }

    public Media setImage_url(String image_url) {
        this.image_url = image_url;
        return this;
    }

    public String getImage_url_thumb() {
        return image_url_thumb;
    }

    public Media setImage_url_thumb(String image_url_thumb) {
        this.image_url_thumb = image_url_thumb;
        return this;
    }

}
