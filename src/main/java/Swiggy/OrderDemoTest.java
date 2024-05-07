package Swiggy;

import java.util.Set;

public class OrderDemoTest {
    public static void main (String[] args){
        Address address = new Address();
        address.area= "hitech-city";
        address.flatno="444";
        address.houseno="gtd";

        Address address1 = new Address();
        address1.area= "hitech-city";
        address1.flatno="444";
        address1.houseno="gtd";

        product product= new product();
        product.name="biryani";
        product. price=402;

        Orderitem orderitem = new Orderitem();
        orderitem.price=555;
        orderitem.quantity=3;
        orderitem.product=product;


        Order order=new Order();
        //order.orderId="123456789";
        order.orderitem=orderitem;
       // order.price=401;
        order.addresses=address;

System.out.println(order.orderitem.product.price);
        System.out.println(address.area.equals(address1.area));
        System.out.println(address.houseno.equals(address1.houseno));





    }
}
