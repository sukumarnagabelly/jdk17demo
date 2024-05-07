package swiggydemo;

public class SwiggyTest {
    public static void main(String[] args) {
        Restuarant restuarant1=new Restuarant();
        restuarant1.restaurantName="Paradise";
        restuarant1.mobileNo="8185882881";
        restuarant1.rating="4.5";

        Restuarant restuarant2=new Restuarant();
        restuarant2.restaurantName="Lucky";
        restuarant2.mobileNo="8185882881";
        restuarant2.rating="3.5";

        Restuarant restuarant3=new Restuarant();
        restuarant3.restaurantName="Godariruchulu";
        restuarant3.mobileNo="8185882883";
        restuarant3.rating="2.5";
        System.out.println(restuarant1.mobileNo.equals(restuarant2.mobileNo));
        System.out.println(restuarant2.restaurantName.equals(restuarant3.restaurantName));
    }
}
