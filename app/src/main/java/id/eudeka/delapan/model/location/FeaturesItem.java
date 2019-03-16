package id.eudeka.delapan.model.location;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.TypeConverters;
import android.databinding.BaseObservable;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import javax.annotation.Generated;

import id.eudeka.delapan.util.DataConverter;

@Generated("com.robohorse.robopojogenerator")
@Entity(tableName = "location")
public class FeaturesItem extends BaseObservable implements Serializable {

    @TypeConverters(DataConverter.class)
    @SerializedName("geometry")
    private Geometry geometry;

    @SerializedName("type")
    private String type;

    @SerializedName("properties")
    private Properties properties;

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return
                "FeaturesItem{" +
                        "geometry = '" + geometry + '\'' +
                        ",type = '" + type + '\'' +
                        ",properties = '" + properties + '\'' +
                        "}";
    }
}