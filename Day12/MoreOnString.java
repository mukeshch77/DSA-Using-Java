import java.util.Scanner;

public class MoreOnString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a word :");
        // String word1 = sc.next();
        // System.out.println("Enter a word please :");
        // String word2 = sc.next();

        // System.out.println("Enter a line :");
        // String line1 = sc.nextLine();
        // System.out.println("Enter next line :");
        // String line2 = sc.nextLine();

        // System.out.println("word1 : "+ word1 +",");
        // System.out.println("word2 : "+ word2 +",");
        // System.out.println("line1 : "+ line1 +"*");
        // System.out.println("line2 : "+ line2 +"*");

        // concatenation
        // System.out.println("Mukesh" + 65 + 34.77);
        // System.out.println("Mukesh" + (65 + 34.77));

        // System.out.println(65 + 34.77 + "Mukesh");
        
        // String cal = 65 + 34.77 + "Mukesh";

        // String name = "Mukesh Choudhary";
        // int rollNumber = 77;
        // System.out.println("My name is " + name + ", my roll number is " + rollNumber);

        // String formatting
        double num = 67.34865394876;
        System.out.println(num);
        System.out.printf("Number is %.2f", num);
        System.out.println();
        String address = "India";
        // String name = String.format("Number is %f address is %s ", num, address);
        String name = String.format("Number is %2$f address is %1$s ", address, num);
        System.out.println(name);
    }
}
