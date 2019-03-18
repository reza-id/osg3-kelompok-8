package id.eudeka.delapan.navigator;

import java.util.List;

import id.eudeka.delapan.model.Incident;

public interface IncidentNavigator {
    void loadListIncident(List<Incident> listIncident);
    void errorloadListIncident(String message);
}
