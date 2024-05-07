package equalshashcode;

public class EqualsHashCodeDemoTest {
    public static void main(String[] args) {
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
        System.out.println();
       System.out.println(address1.equals(address2));
        System.out.println(address2.equals(address1));
    }

}
