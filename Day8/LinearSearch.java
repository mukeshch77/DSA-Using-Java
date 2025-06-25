public class LinearSearch {
    public static void main(String[] args) {
        // int arr[] = {-4, 3, 5, 6, -8, 3, 5, 4, 6};
        // linearSearch(arr, 4, false);
        // linearSearch(arr, 4, true);
        // multipleLinearSearch(arr, 4);
        // findMax(arr);
        // findMin(arr);

        int arr2d[][] = {
                { 3, 5, 8, 4, 2 },
                { 5, 7, 2, 1, 4 },
                { 1, 2, 1, 5, 3 },
                { 9, 3, 6, 4, 7 }
        };

        // linearSearch2d(arr2d, 4, false);
        // linearSearch2d(arr2d, 4, true);
        // multipleLinearSearch2d(arr2d, 5);
        findMaxSumSubarray(arr2d);

    }

    public static void linearSearch(int arr[], int target, boolean findLast) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
                if (findLast == false) {
                    break;
                }
            }
        }

        if (ans == -1) {
            System.out.println("Target element is not present in the array.");
        } else {

            System.out.println("Target element index are : " + ans);
        }
    }

    public static void linearSearch2d(int arr[][], int target, boolean findLast) {
        int innerIndex = -1;
        int outerIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    outerIndex = i;
                    innerIndex = j;
                    if (findLast == false) {
                        found = true;
                        break;
                    }
                }
            }
            if (found == true) {
                break;
            }
        }

        if (outerIndex == -1) {
            System.out.println("Target element is not present in the array.");
        } else {

            System.out.println("Target element index are : " + outerIndex + ", " + innerIndex);
        }
    }

    public static void multipleLinearSearch(int arr[], int target) {
        int ans[] = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans[k] = i;
                k++;
            }
        }

        if (k == 0) {
            System.out.println("Target element is not present in the array.");
        } else {
            for (int i = 0; i < k; i++) {
                System.out.println("Target element index are : " + ans[i]);
            }
        }
    }

    public static void multipleLinearSearch2d(int arr[][], int target) {
        // int size = arr.length * arr[0].length;

        int size = 0;
        for(int i = 0; i < arr.length; i++){
            size = size + arr[i].length;
        }

        int ans[][] = new int[size][2];
        int k = 0;

        // int innerIndex = -1;
        // int outerIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    ans[k][0] = i;
                    ans[k][1] = j;
                    k++;
                }
            }
        }

        if (k == 0) {
            System.out.println("Target element is not present in the array.");
        } else {
            for (int i = 0; i < k; i++) {
                System.out.println("Target element index are : " + ans[i][0]+ ", "+ ans[i][1]);
            }
        }
    }

    public static int findMax(int arr[]) {
        int max = arr[0];
        // int rea1 = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
        // System.out.println("Max element in array is : " + max);
    }

    public static void findMaxSumSubarray(int arr[][]) {
        int maxSum[] = new int [arr.length];
        for (int i = 1; i < arr.length; i++) {
            int sum = 0; 
            for (int j = 0; j < arr[i].length; j++){
                sum = sum + arr[i][j];
            }
            maxSum[i] = sum;
        }
        int max = findMax(maxSum);
        System.out.println("Max element in sub array is : " + max);

        // int max = Integer.MIN_VALUE;
        // int resIndex = 0;
        // for (int i = 1; i < arr.length; i++) {
        //     int sum = 0; 
        //     for (int j = 0; j < arr[i].length; j++){
        //         sum = sum + arr[i][j];
        //     }
        //     if(sum > max){
        //         max = sum; 
        //         resIndex = i;
        //     }
        // }
        // System.out.println("Max sum of subarray is " + max + ", and indes are : "+ resIndex);
    }

    public static void findMin(int arr[]) {
        int min = arr[0];
        // int rea1 = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Min element in array is : " + min);
    }
}