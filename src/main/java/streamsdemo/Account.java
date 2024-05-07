package streamsdemo;

import java.util.List;
import java.util.Objects;

public class Account {
    public String accountNum;
    public  double balance;
    public String ifscCode;
    public Address address;
    public User user;
    public List<AccountDetails>accountDetailsList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNum, account.accountNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNum);
    }
}
