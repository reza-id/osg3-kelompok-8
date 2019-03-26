package id.eudeka.delapan.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Media implements Parcelable {

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

    public static final Parcelable.Creator<Media> CREATOR = new Parcelable.Creator<Media>() {
        @Override
        public Media createFromParcel(Parcel source) {
            return new Media(source);
        }

        @Override
        public Media[] newArray(int size) {
            return new Media[size];
        }
    };

    public Media() {
    }

    protected Media(Parcel in) {
        this.image_url = in.readString();
        this.image_url_thumb = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.image_url);
        dest.writeString(this.image_url_thumb);
    }
}
