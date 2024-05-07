package streamsdemo;

import java.util.Date;

public class AccountDetails {
    public String description;
    public Date txndate;
    public String amountType;
    public double amount;

    @Override
    public String toString() {
        return "AccountDetails{" +
                "description='" + description + '\'' +
                ", txndate=" + txndate +
                ", amountType='" + amountType + '\'' +
                ", amount=" + amount +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public Date getTxndate() {
        return txndate;
    }

    public String getAmountType() {
        return amountType;
    }

    public double getAmount() {
        return amount;
    }
}
