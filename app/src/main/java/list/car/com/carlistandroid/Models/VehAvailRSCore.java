package list.car.com.carlistandroid.Models;

import java.util.List;

/**
 * Created by mateusandrade on 04/11/2017.
 */

public class VehAvailRSCore {

    VehRentalCore VehRentalCore;

    public List<VehVendorAvails> VehVendorAvails;

    public VehAvailRSCore() {
    }

    public list.car.com.carlistandroid.Models.VehRentalCore getVehRentalCore() {
        return VehRentalCore;
    }

    public void setVehRentalCore(list.car.com.carlistandroid.Models.VehRentalCore vehRentalCore) {
        VehRentalCore = vehRentalCore;
    }

    public List<list.car.com.carlistandroid.Models.VehVendorAvails> getVehVendorAvails() {
        return VehVendorAvails;
    }

    public void setVehVendorAvails(List<list.car.com.carlistandroid.Models.VehVendorAvails> vehVendorAvails) {
        VehVendorAvails = vehVendorAvails;
    }
}
