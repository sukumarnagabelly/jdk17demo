package functionsdemo;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemoTest {
    Function<String,String> toUpperFunc=(fullname)->{
        return fullname.toUpperCase();
    };
    BiFunction<String,String,String>concatFun=
            (firstName,lastName)->{
        String fullname=firstName+lastName;
                System.out.println("Name"+fullname);
                return fullname;
            };

    BiFunction<String,String,Integer>countFun=
            (firstName,lastName)->{
                String fullname=firstName+lastName;
                int firstNamelength=firstName.length();
                int lastNamelength=lastName.length();
                System.out.println("Name"+fullname);
                return fullname.length();
            };
    public String concatName(String firstName,String lastName){
        String fullName=firstName+lastName;
        System.out.println("Name"+fullName);
        return fullName;
    }
    public static void main(String[] args) {
        FunctionDemoTest demoTest=new FunctionDemoTest();
        demoTest.concatName("Neoteric","Method");
        demoTest.concatFun.apply("Neoteric","Method");
      int length=demoTest.countFun.apply("Neoteric","Method");
        System.out.println("length"+length);
        String outputName= demoTest.toUpperFunc.apply("Neoteric");
        System.out.println("outputName"+outputName);
    }
}
