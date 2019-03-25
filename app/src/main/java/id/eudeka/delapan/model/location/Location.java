package id.eudeka.delapan.model.location;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Location {

    @SerializedName("features")
    private List<FeaturesItem> features;

    @SerializedName("type")
    private String type;

    public List<FeaturesItem> getFeatures() {
        return features;
    }

    public void setFeatures(List<FeaturesItem> features) {
        this.features = features;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return
                "Location{" +
                        "features = '" + features + '\'' +
                        ",type = '" + type + '\'' +
                        "}";
    }
}