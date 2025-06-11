import java.util.Scanner;

public class Inputs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tell me about your self ??");

        System.out.println("Your first name : ");
        String firstName = sc.next();
        System.out.println("Your second name : ");
        String secondName = sc.next();

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        System.out.println("Enter your address : ");
        sc.nextLine(); //just ignore \n
        String address = sc.nextLine();

        System.out.println("My name is "+ firstName +" "+ secondName + " and My age is "+ age + " and I am from " + address);

    }
}
