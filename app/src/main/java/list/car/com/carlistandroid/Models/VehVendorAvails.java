package list.car.com.carlistandroid.Models;

import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mateusandrade on 04/11/2017.
 */

public class VehVendorAvails {

    Vendor Vendor;
    public List<VehAvails> VehAvails;

    public VehVendorAvails() {
    }

    public list.car.com.carlistandroid.Models.Vendor getVendor() {
        return Vendor;
    }

    public void setVendor(list.car.com.carlistandroid.Models.Vendor vendor) {
        Vendor = vendor;
    }

    public List<list.car.com.carlistandroid.Models.VehAvails> getVehAvails() {
        return VehAvails;
    }

    public void setVehAvails(List<list.car.com.carlistandroid.Models.VehAvails> vehAvails) {
        VehAvails = vehAvails;
    }
}
