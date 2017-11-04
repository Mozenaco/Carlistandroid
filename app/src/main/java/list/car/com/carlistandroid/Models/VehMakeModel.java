package list.car.com.carlistandroid.Models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by mateusandrade on 04/11/2017.
 */

public class VehMakeModel implements Serializable {

    @SerializedName("@Name")
    String name;

    public VehMakeModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
