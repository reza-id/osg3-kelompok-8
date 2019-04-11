package id.eudeka.delapan;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by Fajar Septian on 31/03/2019.
 *
 * @Author Fajar Septian
 * @Email fajarajay10@gmail.com
 * @Github https://github.com/fajarazay
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);

    }
}
