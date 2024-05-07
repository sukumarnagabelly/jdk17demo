package streamsdemo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingDouble;


public class streamDemo {
    public static void main(String[] args) {

        AccountService accountService=new AccountService();
        Map<Account, Account> accountMap = accountService.summary();
        Account account=new Account();
        account.accountNum = "8185882881";
        Account fullAccount=accountMap.get(account);
        System.out.println(fullAccount.accountNum);
        Predicate<AccountDetails> creditTypepredicate= (accountDetail)->accountDetail.equals("credit");

        List<AccountDetails> creditAccountDetails = fullAccount.accountDetailsList.stream().
                filter(abc->creditTypepredicate.test(abc)).collect(Collectors.toList());

        System.out.println("stream credit account details"+creditAccountDetails);

//        List<AccountDetails>creditAccountdetails=fullAccount.accountDetailsList.stream().filter(accountDetails -> creditTypepredicate.test(accountDetails)).collect(Collectors.toList());

        Map<String,Double>groupBytypesum= fullAccount.accountDetailsList.stream()
                .collect(groupingBy(AccountDetails::getAmountType,summingDouble(AccountDetails::getAmount)));
        System.out.println(groupBytypesum);

        Map<String,Double>groupBynormalMap=new HashMap<String, Double>();
        double creditSum=0;
        double debitSum=0;
        for (int i=0;i<fullAccount.accountDetailsList.size();i++) {
            if (fullAccount.accountDetailsList.get(i).amountType.equals("credit")) {
            AccountDetails details = fullAccount.accountDetailsList.get(i);
            creditSum = creditSum + details.getAmount();
            //normalForcreditAccountDetails.add(fullAcount.accountDetails.get(i));
        }
        else if (fullAccount.accountDetailsList.get(i).amountType.equals("debit")) ;
        AccountDetails details = fullAccount.accountDetailsList.get(i);
        creditSum = creditSum + details.getAmount();
        //normalForcreditAccountDetails.add(fullAcount.accountDetails.get(i));
        }


    }
}
