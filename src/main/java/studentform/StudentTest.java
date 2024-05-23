package studentform;

import education.Student;

public class StudentTest {
    public static void main(String[] args) {
        Studentform sanjayfather=new Studentform();

       String temp ="sanjay";


        sanjayfather.name=temp;
        sanjayfather.dob="10-10-2001";
        sanjayfather.standard="7th";
        sanjayfather.fathername="srinivas";
        sanjayfather.phonenumber="+918356866788";
        sanjayfather.street="nehru nagar";
        sanjayfather.city="suryapet";
        sanjayfather.pincode="508213";



        Studentform bunny=new Studentform();

        bunny.name=temp;

        System.out.println(sanjayfather.name);
        System.out.println(bunny.name);




    }
}
