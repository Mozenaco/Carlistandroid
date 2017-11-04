package list.car.com.carlistandroid.Models;

import list.car.com.carlistandroid.Enums.FuelType;
import list.car.com.carlistandroid.Enums.TransmissionType;

/**
 * Created by mateusandrade on 04/11/2017.
 */

public class Vehicle {

    Boolean airConditionInd;
    TransmissionType transmissionType;
    FuelType fuelType;
    String passengerQuantity;
    Integer baggageQuantity;
    String code;
    String codeContext;
    Integer doorCount;
    VehMakeModel vehMakeModel;
    String pictureURL;

    public Vehicle(Boolean airConditionInd, TransmissionType transmissionType, FuelType fuelType, String passengerQuantity, Integer baggageQuantity, String code, String codeContext, Integer doorCount, VehMakeModel vehMakeModel, String pictureURL) {
        this.airConditionInd = airConditionInd;
        this.transmissionType = transmissionType;
        this.fuelType = fuelType;
        this.passengerQuantity = passengerQuantity;
        this.baggageQuantity = baggageQuantity;
        this.code = code;
        this.codeContext = codeContext;
        this.doorCount = doorCount;
        this.vehMakeModel = vehMakeModel;
        this.pictureURL = pictureURL;
    }

    public Boolean getAirConditionInd() {
        return airConditionInd;
    }

    public void setAirConditionInd(Boolean airConditionInd) {
        this.airConditionInd = airConditionInd;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public String getPassengerQuantity() {
        return passengerQuantity;
    }

    public void setPassengerQuantity(String passengerQuantity) {
        this.passengerQuantity = passengerQuantity;
    }

    public Integer getBaggageQuantity() {
        return baggageQuantity;
    }

    public void setBaggageQuantity(Integer baggageQuantity) {
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

    public Integer getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(Integer doorCount) {
        this.doorCount = doorCount;
    }

    public VehMakeModel getVehMakeModel() {
        return vehMakeModel;
    }

    public void setVehMakeModel(VehMakeModel vehMakeModel) {
        this.vehMakeModel = vehMakeModel;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }
}
