package id.eudeka.delapan.data.remote;

import java.util.List;

import id.eudeka.delapan.data.IncidentDataSource;
import id.eudeka.delapan.model.Incident;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class IncidentRemoteDataSource implements IncidentDataSource {

    private ApiInterface apiInterface = ApiClient.getInsident().create(ApiInterface.class);

    @Override
    public void getListIncident(final GetIncidentCallback callback) {
        Call<List<Incident>> call = apiInterface.getAllIncident("");
        call.enqueue(new Callback<List<Incident>>() {
            @Override
            public void onResponse(Call<List<Incident>> call, Response<List<Incident>> response) {
                callback.onIncidentLoaded(response.body());
            }

            @Override
            public void onFailure(Call<List<Incident>> call, Throwable t) {
                callback.onDataNotAvailabel(t.toString());
            }
        });

    }
}
