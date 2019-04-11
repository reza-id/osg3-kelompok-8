package id.eudeka.delapan.data;

import id.eudeka.delapan.data.remote.LocationsRemoteDataSource;
import id.eudeka.delapan.model.Locations;

public class LocationsRepository implements LocationsDataSource {

    private LocationsRemoteDataSource locationsRemoteDataSource;

    public LocationsRepository(LocationsRemoteDataSource locationsRemoteDataSource){
        this.locationsRemoteDataSource = locationsRemoteDataSource;
    }

    @Override
    public void getListLocations(final GetLocationCallback callback) {
        locationsRemoteDataSource.getListLocations(new GetLocationCallback() {
            @Override
            public void onLocationLoaded(Locations data) {
                callback.onLocationLoaded(data);
            }

            @Override
            public void onDataNotAvailabel(String errorMessage) {
                callback.onDataNotAvailabel(errorMessage);
            }
        });
    }
}
