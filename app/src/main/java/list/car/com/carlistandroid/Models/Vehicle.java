package list.car.com.carlistandroid.Models;

import com.google.gson.annotations.SerializedName;

import list.car.com.carlistandroid.Enums.FuelType;
import list.car.com.carlistandroid.Enums.TransmissionType;

/**
 * Created by mateusandrade on 04/11/2017.
 */

public class Vehicle {

    @SerializedName("@AirConditionInd")
    Boolean airConditionInd;

    @SerializedName("@TransmissionType")
    String transmissionType;

    @SerializedName("@FuelType")
    String fuelType;

    @SerializedName("@DriveType")
    String driveType;

    @SerializedName("@PassengerQuantity")
    String passengerQuantity;

    @SerializedName("@BaggageQuantity")
    String baggageQuantity;

    @SerializedName("@Code")
    String code;

    @SerializedName("@CodeContext")
    String codeContext;

    @SerializedName("@DoorCount")
    String doorCount;

    VehMakeModel VehMakeModel;
    String PictureURL;

    public Vehicle() {
    }

    public Boolean getAirConditionInd() {
        return airConditionInd;
    }

    public void setAirConditionInd(Boolean airConditionInd) {
        this.airConditionInd = airConditionInd;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public String getPassengerQuantity() {
        return passengerQuantity;
    }

    public void setPassengerQuantity(String passengerQuantity) {
        this.passengerQuantity = passengerQuantity;
    }

    public String getBaggageQuantity() {
        return baggageQuantity;
    }

    public void setBaggageQuantity(String baggageQuantity) {
        this.baggageQuantity = baggageQuantity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeContext() {
        return codeContext;
    }

    public void setCodeContext(String codeContext) {
        this.codeContext = codeContext;
    }

    public String getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(String doorCount) {
        this.doorCount = doorCount;
    }

    public list.car.com.carlistandroid.Models.VehMakeModel getVehMakeModel() {
        return VehMakeModel;
    }

    public void setVehMakeModel(list.car.com.carlistandroid.Models.VehMakeModel vehMakeModel) {
        VehMakeModel = vehMakeModel;
    }

    public String getPictureURL() {
        return PictureURL;
    }

    public void setPictureURL(String pictureURL) {
        PictureURL = pictureURL;
    }
}
