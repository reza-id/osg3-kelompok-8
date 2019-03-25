package id.eudeka.delapan.model.incident;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Incident {

    @SerializedName("incidents")
    private List<IncidentsItem> incidents;

    public List<IncidentsItem> getIncidents() {
        return incidents;
    }

    public void setIncidents(List<IncidentsItem> incidents) {
        this.incidents = incidents;
    }

    @Override
    public String toString() {
        return
                "Incident{" +
                        "incidents = '" + incidents + '\'' +
                        "}";
    }
}