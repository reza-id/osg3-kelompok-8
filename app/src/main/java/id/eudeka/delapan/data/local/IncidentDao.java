package id.eudeka.delapan.data.local;

import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import id.eudeka.delapan.model.incident.IncidentsItem;

/**
 * Created by Fajar Septian on 17/03/2019.
 *
 * @Author Fajar Septian
 * @Email fajarajay10@gmail.com
 * @Github https://github.com/fajarazay
 */
public interface IncidentDao {
    @Query("Select * from incident")
    List<IncidentsItem> getIncident();

    @Insert
    void insertIncident(List<IncidentsItem> incidentsItemList);
}
