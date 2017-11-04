package list.car.com.carlistandroid.Models;

import com.google.gson.annotations.SerializedName;

import list.car.com.carlistandroid.Enums.Status;

/**
 * Created by mateusandrade on 04/11/2017.
 */

public class VehAvails {


    @SerializedName("@Status")
    String status;

    Vehicle Vehicle;
    TotalCharge TotalCharge;

    public VehAvails() {

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public list.car.com.carlistandroid.Models.Vehicle getVehicle() {
        return Vehicle;
    }

    public void setVehicle(list.car.com.carlistandroid.Models.Vehicle vehicle) {
        Vehicle = vehicle;
    }

    public list.car.com.carlistandroid.Models.TotalCharge getTotalCharge() {
        return TotalCharge;
    }

    public void setTotalCharge(list.car.com.carlistandroid.Models.TotalCharge totalCharge) {
        TotalCharge = totalCharge;
    }
}
