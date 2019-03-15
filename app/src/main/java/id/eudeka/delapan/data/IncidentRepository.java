package id.eudeka.delapan.data;

import id.eudeka.delapan.data.remote.IncidentRemoteDataSource;

public class IncidentRepository implements IncidentDataSource {

    private IncidentRemoteDataSource incidentRemoteDataSource;

    public IncidentRepository(IncidentRemoteDataSource incidentRemoteDataSource){
        this.incidentRemoteDataSource = incidentRemoteDataSource;
    }

    @Override
    public void getListIncident(GetIncidentCallback callback) {

    }
}
