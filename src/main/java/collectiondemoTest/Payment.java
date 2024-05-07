package collectiondemoTest;

public class Payment {
    public String status;
    public String accountnumber;

    @Override
    public String toString() {
        return "Payment{" +
                "status='" + status + '\'' +
                ", accountnumber='" + accountnumber + '\'' +
                '}';
    }
}
