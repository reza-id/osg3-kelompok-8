package id.eudeka.delapan.data.local;

import android.content.Context;

import java.util.List;

import id.eudeka.delapan.data.IncidentDataSource;
import id.eudeka.delapan.model.Incident;
import id.eudeka.delapan.model.Incidents;

/**
 * Created by Fajar Septian on 17/03/2019.
 *
 * @Author Fajar Septian
 * @Email fajarajay10@gmail.com
 * @Github https://github.com/fajarazay
 */
public class IncidentLocalDataSource implements IncidentDataSource {
    private Context context;
    private IncidentDao incidentDao;

    public IncidentLocalDataSource(Context context) {
        this.context = context;
        incidentDao = BikeWiseDataBase.getInstance(this.context).incidentDao();
    }

    public void saveDataTeam(final List<Incident> incidentsList) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                incidentDao.insertIncident(incidentsList);
            }
        };
        new Thread(runnable).start();
    }

    @Override
    public void getListIncident(final GetIncidentCallback callback) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                final List<Incident> incidentList = incidentDao.getIncident();
                if (incidentList.isEmpty()) {
                    callback.onDataNotAvailabel("Data di Database SQLITE kosong");
                } else {
                    Incidents incidents = new Incidents(incidentList);
                    callback.onIncidentLoaded(incidents);
                }
            }
        };
        new Thread(runnable).start();
    }

    public void saveDataIncident(final List<Incident> incidentList) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                incidentDao.insertIncident(incidentList);
            }
        };
        new Thread(runnable).start();
    }
}
