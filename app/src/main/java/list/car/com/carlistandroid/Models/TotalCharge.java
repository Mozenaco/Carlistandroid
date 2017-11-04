package list.car.com.carlistandroid.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by mateusandrade on 04/11/2017.
 */

public class TotalCharge {

    @SerializedName("@RateTotalAmount")
    String rateTotalAmount;

    @SerializedName("@EstimatedTotalAmount")
    String estimatedTotalAmount;

    @SerializedName("@CurrencyCode")
    String currencyCode;

    public TotalCharge() {
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
