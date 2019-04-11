package id.eudeka.delapan.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class Geometry {

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("coordinates")
    @Expose
    private ArrayList<String> coordinates;

    public String getType() {
        return type;
    }

    public Geometry setType(String type) {
        this.type = type;
        return this;
    }

    public ArrayList<String> getCoordinates() {
        return coordinates;
    }

    public Geometry setCoordinates(ArrayList<String> coordinates) {
        this.coordinates = coordinates;
        return this;
    }

}
