package id.eudeka.delapan.model.incident;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Media {

    @SerializedName("image_url")
    private String imageUrl;

    @SerializedName("image_url_thumb")
    private String imageUrlThumb;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrlThumb() {
        return imageUrlThumb;
    }

    public void setImageUrlThumb(String imageUrlThumb) {
        this.imageUrlThumb = imageUrlThumb;
    }

    @Override
    public String toString() {
        return
                "Media{" +
                        "image_url = '" + imageUrl + '\'' +
                        ",image_url_thumb = '" + imageUrlThumb + '\'' +
                        "}";
    }
}