
import java.util.Scanner;

public class MultiDimentionalArray {
    public static void main(String[] args) {

        int arr[][] = new int[3][2];
        MultiDimentionalArray md = new MultiDimentionalArray();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter " + j + " element");
                int element = sc.nextInt();
                arr[i][j] = element;
            }
        }

        md.printTwoDArray(arr);

    }  

    public void printTwoDArray(int arr[][]) {
        MyArray ma = new MyArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("For " + i + " index");
        }

    }
}
