package streamsdemo;

import java.util.*;

public class AccountService {
    public Map<Account, Account> summary() {
        Map<Account, Account>accountMap=new HashMap<>();
        List<AccountDetails>accountDetailsList=new ArrayList<>();
        Address userAddress =new Address();
        userAddress.pincode="506015";
        userAddress.area="hyathnagar";
        userAddress.state="telangana";

        Address accountAddress =new Address();
        accountAddress.pincode="506015";
        accountAddress.area="srnagar";
        accountAddress.state="telangana";

        User user=new User();
        user.aadhar="806015";
        user.DOB="23-2-19980";
        user.name="sukumar";
        user.address=userAddress;


        Account account=new Account();
        account.accountNum="8185882881";
        account.address=accountAddress;
        account.user=user;
        account.ifscCode="sbi00";
        account.accountDetailsList=accountDetailsList;

        AccountDetails accountDetails=new AccountDetails();
        accountDetails.amountType="debit";
        accountDetails.description="hostel";
        accountDetails.txndate=new Date(5-4-2023);
        accountDetails.amount=500;


        AccountDetails accountDetails1=new AccountDetails();
        accountDetails1.amountType="credit";
        accountDetails1.description="salary";
        accountDetails1.txndate=new Date(6-4-2023);
        accountDetails1.amount=600;


        accountDetailsList.add(accountDetails);
        accountDetailsList.add(accountDetails1);


        accountDetailsList.add(accountDetails);
        accountDetailsList.add(accountDetails1);

        accountMap.put(account,account);
       return accountMap;





    }
}
