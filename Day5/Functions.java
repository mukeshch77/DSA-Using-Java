class Temp{
    int myVar1 = 23;
}

public class Functions {
    public static void main(String[] args) {
        Functions f = new Functions();

        Temp obj1 = new Temp();
        Temp obj2 = new Temp();

        // obj1.myVar1 = 10;
        // obj2.myVar1 = 20;
        // f.swapByRef(obj1, obj2);
        // System.out.println("After call : " + obj1.myVar1 + ", " + obj2.myVar1);

        // f.calculateArea(4, 7);
        // int res = f.calculateArea(4, 7);
        // System.out.println(res);


        int num1 = 10;
        int num2 = 40;
        int num3 = 30;
        int num4 = 50;
        // System.out.println("Before swaping :");
        // System.out.println("Num1 : " + num1 + " Num2 : " + num2);
        // f.swap(num1, num2);

        f.swap();
        f.swap(num1, num2);
        f.swap(num3, num2);
        f.swap(num3, num4);
    }

    public void swap(int val1, int val2){
        System.out.println("Before swaping in function : " + val1 + ", " + val2);
        int temp = val1;
        val1 = val2;
        val2 = temp;

        System.out.println("After Swaping : " + val1 + ", " + val2);
    }
    
    public void swap(long val1, int val2){
        System.out.println("Before swaping in function : " + val1 + ", " + val2);
        long temp = val1;
        val1 = val2;
        val2 = (int)temp;

        System.out.println("After Swaping : " + val1 + ", " + val2);
    }
    
    public void swap(long val1, long val2){
        System.out.println("Before swaping in function : " + val1 + ", " + val2);
        long temp = val1;
        val1 = val2;
        val2 = temp;

        System.out.println("After Swaping : " + val1 + ", " + val2);
    }
    
    public void swap(){
        System.out.println("Bhai ab jyda ho rha hai!!!");
    }
    
    // public void swapByRef(Temp val1, Temp val2){
    //     System.out.println("1. Before swaping : " + val1.myVar1 + ", " + val2.myVar1);
    //     val1 = new Temp();
    //     val1.myVar1 = 10;
        
    //     val2 = new Temp();
    //     val2.myVar1 = 20;

    //     System.out.println("2. Before swaping : " + val1.myVar1 + ", " + val2.myVar1);

    //     int temp = val1.myVar1;
    //     val1.myVar1 = val2.myVar1;
    //     val2.myVar1 = temp;

    //     System.out.println("After Swaping : " + val1.myVar1 + ", " + val2.myVar1);
    // }

    // public void calculateArea(int l, int w){ //No return anything
    //     System.out.println(l * w);
    // }
    
    public int calculateArea(int l, int w){
        int area = l * w;
        return area;
    }
}
