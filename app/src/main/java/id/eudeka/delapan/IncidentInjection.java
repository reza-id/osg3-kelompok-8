package id.eudeka.delapan;

import android.content.Context;

import id.eudeka.delapan.data.IncidentRepository;
import id.eudeka.delapan.data.remote.IncidentRemoteDataSource;

public class IncidentInjection {
    public static IncidentRepository provideIncidentRepository() {
        return new IncidentRepository(new IncidentRemoteDataSource());
    }
}
