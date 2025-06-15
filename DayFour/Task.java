import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        // int copy = num;
        int count = 0;

        while (num > 0) {
            num = num / 2;
            count++;
            if (count >= 5) {
                System.out.println("Exit the loop");
                break;
            }

            if (num % 2 == 1) {
                continue;
            } else {
                System.out.println("Number is " + num);
            }

        }
    }
}
