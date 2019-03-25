package id.eudeka.delapan.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Incident implements Parcelable {

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

    public static final Parcelable.Creator<Incident> CREATOR = new Parcelable.Creator<Incident>() {
        @Override
        public Incident createFromParcel(Parcel source) {
            return new Incident(source);
        }

        @Override
        public Incident[] newArray(int size) {
            return new Incident[size];
        }
    };

    public Incident() {
    }

    protected Incident(Parcel in) {
        this.id = in.readString();
        this.title = in.readString();
        this.description = in.readString();
        this.address = in.readString();
        this.updated_at = in.readString();
        this.url = in.readString();
        this.media = in.readParcelable(Media.class.getClassLoader());
    }

    @Override
    public String toString() {
        return "Incident{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", address='" + address + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", url='" + url + '\'' +
                ", media=" + media +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.address);
        dest.writeString(this.updated_at);
        dest.writeString(this.url);
        dest.writeParcelable(this.media, flags);
    }
}
