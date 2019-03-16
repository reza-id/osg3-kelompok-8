package id.eudeka.delapan.model.location;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Properties {

    @SerializedName("occurred_at")
    private int occurredAt;

    @SerializedName("id")
    private int id;

    @SerializedName("type")
    private String type;

    public int getOccurredAt() {
        return occurredAt;
    }

    public void setOccurredAt(int occurredAt) {
        this.occurredAt = occurredAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return
                "Properties{" +
                        "occurred_at = '" + occurredAt + '\'' +
                        ",id = '" + id + '\'' +
                        ",type = '" + type + '\'' +
                        "}";
    }
}