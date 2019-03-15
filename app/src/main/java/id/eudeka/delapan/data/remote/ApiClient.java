package id.eudeka.delapan.data.remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static id.eudeka.delapan.BuildConfig.BASE_URL;

public class ApiClient {
    private static Retrofit retrofit = null;

    public static Retrofit getInsident(){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL+"incidents/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

    public static Retrofit getLocations(){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL+"locations/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
