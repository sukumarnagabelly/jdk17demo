package countries;

public class Test {
    public static void main(String []args){
        Country country=new Country();
        State State=new State();
        country.name="india";
        country.language="hindi";
        country.state=State;

        System.out.println(country.name);

    }
}
