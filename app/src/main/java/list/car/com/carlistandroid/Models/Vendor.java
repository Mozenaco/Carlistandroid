package list.car.com.carlistandroid.Models;

/**
 * Created by mateusandrade on 04/11/2017.
 */

public class Vendor {

    String code;
    String name;

    public Vendor(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {

        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
