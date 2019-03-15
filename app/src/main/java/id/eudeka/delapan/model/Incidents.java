package id.eudeka.delapan.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Incidents {

    public List<Incident> getIncidents() {
        return incidents;
    }

    public Incidents setIncidents(List<Incident> incidents) {
        this.incidents = incidents;
        return this;
    }

    @SerializedName("incidents")
    @Expose
    private List<Incident> incidents;
}
