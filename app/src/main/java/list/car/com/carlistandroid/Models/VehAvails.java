package list.car.com.carlistandroid.Models;

import list.car.com.carlistandroid.Enums.Status;

/**
 * Created by mateusandrade on 04/11/2017.
 */

public class VehAvails {

    Status status;
    Vehicle vehicle;
    TotalCharge totalCharge;

    public VehAvails(Status status, Vehicle vehicle, TotalCharge totalCharge) {
        this.status = status;
        this.vehicle = vehicle;
        this.totalCharge = totalCharge;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public TotalCharge getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(TotalCharge totalCharge) {
        this.totalCharge = totalCharge;
    }
}
