package id.eudeka.delapan.data;

import id.eudeka.delapan.model.Incidents;

public interface IncidentDataSource {

    void getListIncident(GetIncidentCallback callback);

    interface GetIncidentCallback{
        void onIncidentLoaded(Incidents data);
        void onDataNotAvailabel(String errorMessage);
    }
}
