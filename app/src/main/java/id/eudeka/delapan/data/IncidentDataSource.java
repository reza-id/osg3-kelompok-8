package id.eudeka.delapan.data;

import java.util.List;

import id.eudeka.delapan.model.Incident;

public interface IncidentDataSource {

    void getListIncident(GetIncidentCallback callback);

    interface GetIncidentCallback{
        void onIncidentLoaded(List<Incident> data);
        void onDataNotAvailabel(String errorMessage);
    }
}
