package id.eudeka.delapan.util;

import android.arch.persistence.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import id.eudeka.delapan.model.Media;

/**
 * Created by Fajar Septian on 31/03/2019.
 *
 * @Author Fajar Septian
 * @Email fajarajay10@gmail.com
 * @Github https://github.com/fajarazay
 */
public class DataConverters {
    @TypeConverter // note this annotation
    public String fromMediaList(List<Media> media) {
        if (media == null) {
            return (null);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<List<Media>>() {
        }.getType();
        String json = gson.toJson(media, type);
        return json;
    }

    @TypeConverter // note this annotation
    public List<Media> toMediaList(String mediaString) {
        if (mediaString == null) {
            return (null);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<List<Media>>() {
        }.getType();
        List<Media> mediaList = gson.fromJson(mediaString, type);
        return mediaList;
    }
}
