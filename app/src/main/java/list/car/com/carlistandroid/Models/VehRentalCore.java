package list.car.com.carlistandroid.Models;

/**
 * Created by mateusandrade on 04/11/2017.
 */

public class VehRentalCore {

      String pickUpDateTime;
      String returnDateTime;
      PickUpLocation pickUpLocation;
      ReturnLocation returnLocation;

    public VehRentalCore(String pickUpDateTime, String returnDateTime, PickUpLocation pickUpLocation, ReturnLocation returnLocation) {
        this.pickUpDateTime = pickUpDateTime;
        this.returnDateTime = returnDateTime;
        this.pickUpLocation = pickUpLocation;
        this.returnLocation = returnLocation;
    }

    public String getPickUpDateTime() {
        return pickUpDateTime;
    }

    public void setPickUpDateTime(String pickUpDateTime) {
        this.pickUpDateTime = pickUpDateTime;
    }

    public String getReturnDateTime() {
        return returnDateTime;
    }

    public void setReturnDateTime(String returnDateTime) {
        this.returnDateTime = returnDateTime;
    }

    public PickUpLocation getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(PickUpLocation pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public ReturnLocation getReturnLocation() {
        return returnLocation;
    }

    public void setReturnLocation(ReturnLocation returnLocation) {
        this.returnLocation = returnLocation;
    }
}
