public class basics {

    int age = 20;
    static int rollNo = 234;
    public static void main (String[] args){
        /*
        int local = 23;
        basics obj1 = new basics();
        basics obj2 = new basics();

        
        System.out.println(obj1.age);
        System.out.println(rollNo);

        obj1.age = 25;
        // obj1.rollNo = 345;
        basics.rollNo = 345;

        System.out.println(local);
        System.out.println(obj1.age);
        System.out.println(obj2.age);
        // System.out.println(obj1.rollNo);
        // System.out.println(obj2.rollNo);
        System.out.println(rollNo);
        System.out.println(basics.rollNo);
        */

        // obj1.myfun();
        newClass muk = new newClass();
        System.out.println("My Details are : ");
        muk.mukesh();

    }
    /*
    void myfun(){
        int age = 34;

        basics fun = new basics();
        
        System.out.println(fun.age); //instance variable
        System.out.println(basics.rollNo); // static variable

        basics.rollNo = 123; // updateb the static variable in non-static function
        fun.age = 24; // update the instance variable in non-static function 

        System.out.println(age);
        System.out.println(basics.rollNo);
        System.out.println(fun.age);
        // System.out.println(local); // local variable can not be be access out of block

    }
    */

}

class newClass {
    void mukesh(){
        int age = 22;
        System.out.println("My name Mukesh Choudhary");
        System.out.println("My age is : " + age);
        System.out.println("I am from Jipur, Rajasthan");
    }
}