package list.car.com.carlistandroid.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by mateusandrade on 04/11/2017.
 */

public class PickUpLocation {

    @SerializedName("@Name")
    String name;

    public PickUpLocation() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
