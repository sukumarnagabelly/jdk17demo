package inheritance;

public class User {
    public static void main(String[] args) {
        Guest guest= new Guest();
        guest.read();
        Developer developer= new Developer();
        developer.write();
        developer.read();
        Admin admin=new Admin();
        admin.manage();
        admin.read();
        admin.write();


    }
}
