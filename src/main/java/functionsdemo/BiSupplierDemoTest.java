package functionsdemo;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BiSupplierDemoTest {
   Supplier<List<Restuarant5>> restuarantlist = () -> {
// adding restuarant to arraylist
        List<Restuarant5> list = new ArrayList<>();
        //Object creating for Restuarent class
        Restuarant5 res = new Restuarant5();
        res.name = "mandi";
        list.add(res);
        Restuarant5 res1 = new Restuarant5();
        res1.name = "kfc";
        list.add(res1);
        return list;
    };
   public List<Restuarant5> getRestuarentList(){
       List<Restuarant5> list=new ArrayList<>();
       Restuarant5 res=new Restuarant5();
       res.name="mandi";
       list.add(res);
       Restuarant5 res1=new Restuarant5();
       res1.name="kfc";
       list.add(res1);
       return list;

   }
   Consumer<List<Restuarant5>> restuarentConsumer=(abc)->{
       abc.stream().forEach(test ->{
           System.out.println("consumer "+test.name);
       });
   };

    public static void main(String[] args) {
        BiSupplierDemoTest test=new BiSupplierDemoTest();
        List<Restuarant5> funList=test.restuarantlist.get();
        List<Restuarant5> methodList=test.getRestuarentList();
        System.out.println("function list "+funList);
        System.out.println("method List "+methodList);
       test.restuarentConsumer.accept(funList);
    }

}
