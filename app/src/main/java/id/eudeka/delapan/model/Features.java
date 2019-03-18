package id.eudeka.delapan.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Features {

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("properties")
    @Expose
    private Properties properties;

    @SerializedName("geometry")
    @Expose
    private Geometry geometry;

    public String getType() {
        return type;
    }

    public Features setType(String type) {
        this.type = type;
        return this;
    }

    public Properties getProperties() {
        return properties;
    }

    public Features setProperties(Properties properties) {
        this.properties = properties;
        return this;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public Features setGeometry(Geometry geometry) {
        this.geometry = geometry;
        return this;
    }

}
