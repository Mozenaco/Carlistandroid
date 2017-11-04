package list.car.com.carlistandroid.Models;

import android.util.Log;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mateusandrade on 04/11/2017.
 */

public class VehRentalCore {

    @SerializedName("@PickUpDateTime")
    String PickUpDateTime;

    @SerializedName("@ReturnDateTime")
    String ReturnDateTime;

    PickUpLocation PickUpLocation;
    ReturnLocation ReturnLocation;

    public String getPickUpDateTime() {
        return PickUpDateTime;
    }

    public void setPickUpDateTime(String pickUpDateTime) {
        PickUpDateTime = pickUpDateTime;
    }

    public String getReturnDateTime() {
        return ReturnDateTime;
    }

    public void setReturnDateTime(String returnDateTime) {
        ReturnDateTime = returnDateTime;
    }

    public list.car.com.carlistandroid.Models.PickUpLocation getPickUpLocation() {
        return PickUpLocation;
    }

    public void setPickUpLocation(list.car.com.carlistandroid.Models.PickUpLocation pickUpLocation) {
        PickUpLocation = pickUpLocation;
    }

    public list.car.com.carlistandroid.Models.ReturnLocation getReturnLocation() {
        return ReturnLocation;
    }

    public void setReturnLocation(list.car.com.carlistandroid.Models.ReturnLocation returnLocation) {
        ReturnLocation = returnLocation;
    }

    public static VehRentalCore parse(JsonObject asJsonObject) {

        VehRentalCore v = new VehRentalCore();

        return v;
    }
}
