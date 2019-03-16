package id.eudeka.delapan.data.local;

import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import id.eudeka.delapan.model.location.FeaturesItem;

/**
 * Created by Fajar Septian on 17/03/2019.
 *
 * @Author Fajar Septian
 * @Email fajarajay10@gmail.com
 * @Github https://github.com/fajarazay
 */
public interface LocationDao {
    @Query("Select * from location")
    List<FeaturesItem> getLocation();

    @Insert
    void insertLocation(List<FeaturesItem> locationItemList);
}
