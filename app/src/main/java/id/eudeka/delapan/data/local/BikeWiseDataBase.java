package id.eudeka.delapan.data.local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import id.eudeka.delapan.model.Incident;

/**
 * Created by Fajar Septian on 17/03/2019.
 *
 * @Author Fajar Septian
 * @Email fajarajay10@gmail.com
 * @Github https://github.com/fajarazay
 */
@Database(entities = {Incident.class}, version = 1, exportSchema = false)

public abstract class BikeWiseDataBase extends RoomDatabase {
    private static final Object sLock = new Object();
    private static BikeWiseDataBase INSTANCE;

    public static BikeWiseDataBase getInstance(Context context) {
        synchronized (sLock) {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                        BikeWiseDataBase.class, "BikeWise.db")
                        .build();
            }
            return INSTANCE;
        }
    }

    public abstract IncidentDao incidentDao();
}
