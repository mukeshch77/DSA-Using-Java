import java.util.Scanner;

public class MoreOnString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        String word1 = obj.next();
        System.out.println("Enter a word plrase :");
        String word2 = obj.next();

        System.out.println("Enter a line :");
        String line1 = obj.nextLine();
        System.out.println("Enter next line :");
        String line2 = obj.nextLine();

        System.out.println("word1 : "+ word1 +",");
        System.out.println("word2 : "+ word2 +",");
        System.out.println("line1 : "+ line1 +"*");
        System.out.println("line2 : "+ line2 +"*");
    }
}
