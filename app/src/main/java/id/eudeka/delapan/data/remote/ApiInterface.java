package id.eudeka.delapan.data.remote;

import id.eudeka.delapan.model.Incident;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("incident/")
    Call<Incident> getAllIncident();
}
