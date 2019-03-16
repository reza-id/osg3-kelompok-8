package id.eudeka.delapan.model.incident;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;
import android.databinding.BaseObservable;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import javax.annotation.Generated;

import id.eudeka.delapan.util.DataConverter;

@Generated("com.robohorse.robopojogenerator")
@Entity(tableName = "incident")
public class IncidentsItem extends BaseObservable implements Serializable {

    @PrimaryKey()
    @SerializedName("id")
    private int id;

    @SerializedName("address")
    private String address;

    @SerializedName("description")
    private String description;

    @TypeConverters(DataConverter.class)
    @SerializedName("source")
    private Source source;

    @TypeConverters(DataConverter.class)
    @SerializedName("media")
    private Media media;

    @SerializedName("title")
    private String title;

    @ColumnInfo(name = "location_description")
    @SerializedName("location_description")
    private String locationDescription;

    @SerializedName("type")
    private String type;

    @ColumnInfo(name = "type_properties")
    @SerializedName("type_properties")
    private String typeProperties;

    @SerializedName("url")
    private String url;

    @ColumnInfo(name = "location_type")
    @SerializedName("location_type")
    private String locationType;

    @ColumnInfo(name = "occured_at")
    @SerializedName("occurred_at")
    private int occurredAt;

    @ColumnInfo(name = "updated_at")
    @SerializedName("updated_at")
    private int updatedAt;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Serializable getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeProperties() {
        return typeProperties;
    }

    public void setTypeProperties(String typeProperties) {
        this.typeProperties = typeProperties;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public int getOccurredAt() {
        return occurredAt;
    }

    public void setOccurredAt(int occurredAt) {
        this.occurredAt = occurredAt;
    }

    public int getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(int updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "IncidentsItem{" +
                        "address = '" + address + '\'' +
                        ",description = '" + description + '\'' +
                        ",source = '" + source + '\'' +
                        ",media = '" + media + '\'' +
                        ",title = '" + title + '\'' +
                        ",location_description = '" + locationDescription + '\'' +
                        ",type = '" + type + '\'' +
                        ",type_properties = '" + typeProperties + '\'' +
                        ",url = '" + url + '\'' +
                        ",location_type = '" + locationType + '\'' +
                        ",occurred_at = '" + occurredAt + '\'' +
                        ",updated_at = '" + updatedAt + '\'' +
                        ",id = '" + id + '\'' +
                        "}";
    }
}