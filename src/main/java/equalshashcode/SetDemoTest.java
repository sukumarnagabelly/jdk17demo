package equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class SetDemoTest {
    public static void main(String[] args) {
        Set<Car> carSet=new HashSet<>();
        Car car1=new Car();
        car1.name="punch";
        Car car2=new Car();
        car2.name="punch";

        carSet.add(car1);
        carSet.add(car2);
        System.out.println(carSet);

        Address address1=new Address();
        address1.area="Miyapur";
        address1.state="TG";
        address1.pincode="506015";
        address1.flatno="7/G";
        address1.street="GLR";
        Address address2=new Address();
        address2.area="Miyapur";
        address2.state="TG";
        address2.pincode="506015";
        address2.flatno="7/G";
        address2.street="GLR";

        Set<Address>address=new HashSet<>();
        address.add(address1);
        address.add(address2);

        System.out.println(address);






    }

}
