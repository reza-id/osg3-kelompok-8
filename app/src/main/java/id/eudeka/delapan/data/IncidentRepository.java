package id.eudeka.delapan.data;

import id.eudeka.delapan.data.remote.IncidentRemoteDataSource;
import id.eudeka.delapan.model.Incident;

public class IncidentRepository implements IncidentDataSource {

    private IncidentRemoteDataSource incidentRemoteDataSource;

    public IncidentRepository(IncidentRemoteDataSource incidentRemoteDataSource){
        this.incidentRemoteDataSource = incidentRemoteDataSource;
    }

    @Override
    public void getListIncident(final GetIncidentCallback callback) {
        incidentRemoteDataSource.getListIncident(new GetIncidentCallback() {
            @Override
            public void onIncidentLoaded(Incident data) {
                callback.onIncidentLoaded(data);
            }

            @Override
            public void onDataNotAvailabel(String errorMessage) {
                callback.onDataNotAvailabel(errorMessage);
            }
        });
    }
}
