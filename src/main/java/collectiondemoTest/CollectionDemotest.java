package collectiondemoTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemotest {
    public static void main(String[] args) {
        Restuarant restuarant=new Restuarant();
       restuarant.name="mehfil";
        Restuarant restuarant1=new Restuarant();
        restuarant1.name="paradise";

        Restuarant restuarant2=new Restuarant();
        restuarant2.name="Lucky";

        List<Restuarant> restuarantList=new ArrayList<>();
        restuarantList.add(restuarant);
        restuarantList.add(restuarant1);


        Payment payment1=new Payment();
        payment1.status="completed";
        payment1.accountnumber="5555";

        Payment payment2=new Payment();
        payment2.status="failed";
        payment2.accountnumber="6666";

        List<Payment>paymentList=new ArrayList<>();
        paymentList.add(payment1);
        paymentList.add(payment2);

        for(int i=0;i<restuarantList.size();i++){
         Restuarant restuarant3=restuarantList.get(i);
         System.out.println(restuarant3);
        }
     Iterator<Restuarant>restuarantIterator= restuarantList.iterator();
        for(;restuarantIterator.hasNext();){
         Restuarant restuarant3=restuarantIterator.next();
         System.out.println(restuarant3.name);
        }
        restuarantList.forEach(restaurant->{
            System.out.println("consumer"+restaurant.name);
        });


    }
}
