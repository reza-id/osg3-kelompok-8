package id.eudeka.delapan.data;

import id.eudeka.delapan.model.Incident;
import id.eudeka.delapan.model.Locations;

public interface LocationsDataSource {

    void getListLocation(GetLocationCallback callback);

    interface GetLocationCallback{
        void onLocationLoaded(Locations data);
        void onDataNotAvailabel(String errorMessage);
    }
}
