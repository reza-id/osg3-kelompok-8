package id.eudeka.delapan.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Incidents {

    public List<Incident> getIncidents() {
        return incidents;
    }

    public void setIncidents(List<Incident> incidents) {
        this.incidents = incidents;
    }

    @SerializedName("incidents")
    @Expose
    private List<Incident> incidents;

    public Incidents(List<Incident> incidents) {
        this.incidents = incidents;
    }
}
