import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        CalculatorApp ca = new CalculatorApp();

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Calculator Application - By Java plus DSA");
        // Take input from user and decide which operation to perform
        do {
            System.out.print("Choose an operation : (+, -, *, /, %) -> ");

            String input = sc.next();
            char ch = input.charAt(0);

            if (input.length() != 1) {
                System.out.println("Wrong input, please try again");
            } else {
                ca.chooseOperation(ch);
            }

            boolean exit = ca.exitProgram();

            if (exit) {
                break;
            }

        } while (true);
        System.out.println("Thanks for using our service!!");

    }

    public boolean exitProgram() {
        int times = 0;
        int retry = 4;

        Scanner sc = new Scanner(System.in);

        for (times = 0; times < retry; times++) {
            System.out.println("Do you want to continue? (y/n)");
            String exitInput = sc.next();
            char ch1 = exitInput.charAt(0);

            if (exitInput.length() == 1 && (ch1 == 'N' || ch1 == 'n')) {
                return true;
            } else if (exitInput.length() == 1 && (ch1 == 'Y' || ch1 == 'y')) {
                return false;
            } else {
                System.out.println("Wrong input, please try again");
            }
        }

        if (times >= retry) {
            System.out.println("Maximum retry count exceeded! Exiting forcefully");
            return true;
        }
        return false;
    }

    public int getInteger() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    public void chooseOperation(char ch) {

        switch (ch) {
            case '+':
                System.out.print("Enter first number : ");
                int num1 = getInteger();
                System.out.print("Enter second number : ");
                int num2 = getInteger();
                System.out.println("Addition : " + (num1 + num2));
                break;
            case '-':
                System.out.print("Enter first number : ");
                int num3 = getInteger();
                System.out.print("Enter second number : ");
                int num4 = getInteger();
                System.out.println("Subtraction : " + (num3 - num4));
                break;
            case '*':
                System.out.print("Enter first number : ");
                int num5 = getInteger();
                System.out.print("Enter second number : ");
                int num6 = getInteger();
                System.out.println("Multiply : " + (num5 * num6));
                break;
            case '/':
                System.out.print("Enter first number : ");
                int num7 = getInteger();
                System.out.print("Enter second number : ");
                int num8 = getInteger();
                if (num8 == 0) {
                    System.out.println("Divide by zero error");
                    break;
                }
                System.out.println("Division : " + (num7 / num8));
                break;
            case '%':
                System.out.print("Enter first number : ");
                int num9 = getInteger();
                System.out.print("Enter second number : ");
                int num10 = getInteger();
                if (num10 == 0) {
                    System.out.println("Divide by zero error");
                    break;
                }
                System.out.println("Mode" + (num9 % num10));
                break;
            default:
                System.out.println("Unknown operation");
        }
    }
}
