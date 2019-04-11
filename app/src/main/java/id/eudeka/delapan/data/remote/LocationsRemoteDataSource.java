package id.eudeka.delapan.data.remote;

import id.eudeka.delapan.data.LocationsDataSource;
import id.eudeka.delapan.model.Locations;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LocationsRemoteDataSource implements LocationsDataSource {

    private ApiInterface apiInterface = ApiClient.getLocations().create(ApiInterface.class);

    @Override
    public void getListLocations(final GetLocationCallback callback) {
        Call<Locations> call = apiInterface.getAllLocation();
        call.enqueue(new Callback<Locations>() {
            @Override
            public void onResponse(Call<Locations> call, Response<Locations> response) {
                callback.onLocationLoaded(response.body());
            }

            @Override
            public void onFailure(Call<Locations> call, Throwable t) {
                callback.onDataNotAvailabel(t.toString());
            }
        });
    }
}
