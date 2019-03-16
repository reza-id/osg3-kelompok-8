package id.eudeka.delapan.model.location;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Geometry {

    @SerializedName("coordinates")
    private List<Double> coordinates;

    @SerializedName("type")
    private String type;

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
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
                "Geometry{" +
                        "coordinates = '" + coordinates + '\'' +
                        ",type = '" + type + '\'' +
                        "}";
    }
}