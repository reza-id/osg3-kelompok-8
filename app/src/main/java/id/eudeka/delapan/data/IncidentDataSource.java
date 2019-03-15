package id.eudeka.delapan.data;

import id.eudeka.delapan.model.Incident;

public interface IncidentDataSource {

    void getListIncident(GetIncidentCallback callback);

    interface GetIncidentCallback{
        void onIncidentLoaded(Incident data);
        void onDataNotAvailabel(String errorMessage);
    }
}
