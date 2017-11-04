package list.car.com.carlistandroid.Enums;

/**
 * Created by mateusandrade on 04/11/2017.
 */

public enum FuelType {
    OTHER("Other", 0),
    PETROL("Petrol", 1);

    private String stringValue;
    private int intValue;
    private FuelType(String toString, int value) {
        stringValue = toString;
        intValue = value;
    }

    @Override
    public String toString() {
        return stringValue;
    }
}