package id.eudeka.delapan.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Entity(tableName = "incident")
public class Incident implements Parcelable {
    @NonNull
    @ColumnInfo(name = "id")
    @PrimaryKey()
    @SerializedName("id")
    @Expose
    private String id ="0";

    @ColumnInfo(name = "title")
    @SerializedName("title")
    @Expose
    private String title;

    @ColumnInfo(name = "description")
    @SerializedName("description")
    @Expose
    private String description;

    @ColumnInfo(name = "address")
    @SerializedName("address")
    @Expose
    private String address;

    @ColumnInfo(name = "updated_at")
    @SerializedName("updated_at")
    @Expose
    private String updated_at;

    @ColumnInfo(name = "url")
    @SerializedName("url")
    @Expose
    private String url;

    @Embedded
    @SerializedName("media")
    @Expose
    private Media media;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
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
