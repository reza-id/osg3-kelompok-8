package id.eudeka.delapan.data;

import id.eudeka.delapan.model.Incident;
import id.eudeka.delapan.model.Locations;

public interface LocationsDataSource {

    void getListLocations(GetLocationCallback callback);

    interface GetLocationCallback{
        void onLocationLoaded(Locations data);
        void onDataNotAvailabel(String errorMessage);
    }
}
