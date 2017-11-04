package list.car.com.carlistandroid.Models;

/**
 * Created by mateusandrade on 04/11/2017.
 */

public class VehVendorAvails {

    Vendor vendor;
    VehAvails vehAvails;

    public VehVendorAvails(Vendor vendor, VehAvails vehAvails) {
        this.vendor = vendor;
        this.vehAvails = vehAvails;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public VehAvails getVehAvails() {
        return vehAvails;
    }

    public void setVehAvails(VehAvails vehAvails) {
        this.vehAvails = vehAvails;
    }
}
