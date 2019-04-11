package id.eudeka.delapan.data.local;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import id.eudeka.delapan.model.Incident;


/**
 * Created by Fajar Septian on 17/03/2019.
 *
 * @Author Fajar Septian
 * @Email fajarajay10@gmail.com
 * @Github https://github.com/fajarazay
 */
@Dao
public interface IncidentDao {
    @Query("Select * from incident")
    List<Incident> getIncident();

    @Insert
    void insertIncident(List<Incident> incidentsList);
}
