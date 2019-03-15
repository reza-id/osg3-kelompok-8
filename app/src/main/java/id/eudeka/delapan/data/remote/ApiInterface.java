package id.eudeka.delapan.data.remote;

import java.util.List;

import id.eudeka.delapan.model.Incident;
import id.eudeka.delapan.model.Locations;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {

    @GET("incidents/{id}")
    Call<List<Incident>> getAllIncident(@Path("id") String id);

    @GET("locations/")
    Call<Locations> getAllLocation();
}
