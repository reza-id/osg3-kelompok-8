package id.eudeka.delapan.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Locations {

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("features")
    @Expose
    private List<Features> features;

    public String getType() {
        return type;
    }

    public Locations setType(String type) {
        this.type = type;
        return this;
    }

    public List<Features> getFeatures() {
        return features;
    }

    public Locations setFeatures(List<Features> features) {
        this.features = features;
        return this;
    }
}
