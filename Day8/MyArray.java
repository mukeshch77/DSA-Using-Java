// Capacity -> how many elements are store maximum in the array.
// Size/length -> how many elements are thare in the array.
// Static array -> In this array capacity and size are same.   
// Dynamic array -> in this array the capacity and the size are different.

// import java.util.ArrayList;
import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {

        // ArrayList<Integer> dynamic = new ArrayList<>();

        // int rollNo[] = new int[5];
        // int arr[][] = new int[3][2];

        // int age[];
        // age = new int [8];

        // int dummy[] = { 2, 3, 5, 7, 4, 2, 9, 4 };

        // rollNo[0] = 34;

        // System.out.println(rollNo);

        Scanner sc = new Scanner(System.in);

        // for (int i = 0; i < 3; i++) {
        // System.out.println("Enter " + i + " element");
        // int element = sc.nextInt();
        // rollNo[i] = element;

        // // System.out.print(rollNo[i]+" ");
        // }

        // inputData(rollNo);
        // printArray(rollNo);

        // printArray(rollNo);
        // insertArrayElements(rollNo, 1, 5);
        // printArray(rollNo);
        // deleteArrayElements(rollNo, 1);
        // printArray(rollNo);

        //--------------2D Array----------------------------

        int arr[][] = new int[3][];// Jagged array
        int customSize = 4;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[customSize];

            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter " + j + " element");
                int element = sc.nextInt();
                arr[i][j] = element;
            }
            customSize--;
        }

        printTwoDArray(arr);
        insertTwoDArrayElements(arr, 0, 0, 4);
        printTwoDArray(arr);
        deleteTwoDArrayElements(arr, 0, 0);
        printTwoDArray(arr);
        updateTwoDArrayElements(arr, 0, 0, 8);
        printTwoDArray(arr);

    }

    public static void inputData(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + arr.length + " Array elements :-> ");
        for (int i = 0; i < arr.length; i++) {
            int element = sc.nextInt();
            arr[i] = element;

        }
    }

    public static void printArray(int arr[]) {
        System.out.print("Array elements are :-> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void insertArrayElements(int arr[], int pos, int element) {
        int size = arr.length;
        if (pos < 0 || pos > size - 1) {
            System.out.println("Wrong position!");
            return;
        }
        // shifting towards the end
        for (int i = size - 2; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = element;
    }

    public static void updateArrayElements(int arr[], int pos, int element) {
        int size = arr.length;
        if (pos < 0 || pos > size - 1) {
            System.out.println("Wrong position!");
            return;
        }
        arr[pos] = element;
    }

    public static void deleteArrayElements(int arr[], int pos) {

        // shifting towards the end
        for (int i = pos; i <= arr.length - 2; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        // arr[pos] = element;
    }

    public static void printTwoDArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("For " + i + " index");
            printArray(arr[i]);
        }

    }

    public static void insertTwoDArrayElements(int arr[][], int pos1, int pos2, int element) {
        insertArrayElements(arr[pos1], pos2, element);
    }

    public static void deleteTwoDArrayElements(int arr[][], int pos1, int pos2) {
        deleteArrayElements(arr[pos1], pos2);
    }

    public static void updateTwoDArrayElements(int arr[][], int pos1, int pos2, int element) {
        int size1 = arr.length;
        if (pos1 < 0 || pos1 > size1 - 1) {
            System.out.println("Wrong position!");
            return;
        }
        int size2 = arr[pos1].length;
        if (pos2 < 0 || pos2 > size2 - 1) {
            System.out.println("Wrong position!");
            return;
        }
        arr[pos1][pos2] = element;
    }
}
