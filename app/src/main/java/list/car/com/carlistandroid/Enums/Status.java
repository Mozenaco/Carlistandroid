package list.car.com.carlistandroid.Enums;

/**
 * Created by mateusandrade on 04/11/2017.
 */

public enum Status {
    UNAVAILABLE("Unavailable", 0),
    AVAILABLE("Available", 1);

    private String stringValue;
    private int intValue;
    private Status(String toString, int value) {
        stringValue = toString;
        intValue = value;
    }

    @Override
    public String toString() {
        return stringValue;
    }
}