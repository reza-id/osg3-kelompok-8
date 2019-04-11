package id.eudeka.delapan.data.remote;

import id.eudeka.delapan.data.IncidentDataSource;
import id.eudeka.delapan.model.Incidents;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class IncidentRemoteDataSource implements IncidentDataSource {

    private ApiInterface apiInterface = ApiClient.getInsident().create(ApiInterface.class);

    @Override
    public void getListIncident(final GetIncidentCallback callback) {
        Call<Incidents> call = apiInterface.getAllIncident("");
        call.enqueue(new Callback<Incidents>() {
            @Override
            public void onResponse(Call<Incidents> call, Response<Incidents> response) {
                callback.onIncidentLoaded(response.body());
            }

            @Override
            public void onFailure(Call<Incidents> call, Throwable t) {
                callback.onDataNotAvailabel(t.toString());
            }
        });

    }
}
