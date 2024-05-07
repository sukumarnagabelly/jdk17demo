package swiggydemo;

import java.util.ArrayList;
import java.util.List;

public class SwiggyService {
    public RestuarantList getrestauarntdetails(){
        Restuarant restuarant1=new Restuarant();
        restuarant1.restaurantName="Paradise";
        restuarant1.mobileNo="8185882881";
        restuarant1.rating="4.5";

        Restuarant restuarant2=new Restuarant();
        restuarant2.restaurantName="Lucky";
        restuarant2.mobileNo="8185882882";
        restuarant2.rating="3.5";

        Restuarant restuarant3=new Restuarant();
        restuarant3.restaurantName="Godariruchulu";
        restuarant3.mobileNo="8185882883";
        restuarant3.rating="2.5";


        Dish dish1=new Dish();
        dish1.name="Birayani";
        dish1.price=200;

        Dish dish2=new Dish();
        dish1.name="chicken";
        dish1.price=300;

        Dish dish3=new Dish();
        dish1.name="Mutton";
        dish1.price=400;

        List<Dish>dishList=new ArrayList<>();
        dishList.add(dish1);
        dishList.add(dish2);
        dishList.add(dish3);
        restuarant1.dishList=dishList;
        restuarant2.dishList=dishList;
        restuarant3.dishList=dishList;

        List<Restuarant>restuarantList=new ArrayList<>();
        restuarantList.add(restuarant1);
        restuarantList.add(restuarant2);
        restuarantList.add(restuarant3);

        return null;

    }
}
