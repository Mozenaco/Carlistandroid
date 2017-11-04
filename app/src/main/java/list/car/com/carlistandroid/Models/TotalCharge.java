package list.car.com.carlistandroid.Models;

/**
 * Created by mateusandrade on 04/11/2017.
 */

public class TotalCharge {

    String rateTotalAmount;
    String estimatedTotalAmount;
    String currencyCode;

    public TotalCharge(String rateTotalAmount, String estimatedTotalAmount, String currencyCode) {
        this.rateTotalAmount = rateTotalAmount;
        this.estimatedTotalAmount = estimatedTotalAmount;
        this.currencyCode = currencyCode;
    }

    public String getRateTotalAmount() {

        return rateTotalAmount;
    }

    public void setRateTotalAmount(String rateTotalAmount) {
        this.rateTotalAmount = rateTotalAmount;
    }

    public String getEstimatedTotalAmount() {
        return estimatedTotalAmount;
    }

    public void setEstimatedTotalAmount(String estimatedTotalAmount) {
        this.estimatedTotalAmount = estimatedTotalAmount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
