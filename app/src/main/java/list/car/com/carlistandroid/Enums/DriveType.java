package list.car.com.carlistandroid.Enums;

/**
 * Created by mateusandrade on 04/11/2017.
 */

public enum DriveType {
    OTHER("Other", 0),
    UNSPECIFIED("Unspecified", 1);

    private String stringValue;
    private int intValue;
    private DriveType(String toString, int value) {
        stringValue = toString;
        intValue = value;
    }

    @Override
    public String toString() {
        return stringValue;
    }
}