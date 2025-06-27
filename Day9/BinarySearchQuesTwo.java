public class BinarySearchQuesTwo {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 6, 7, 8 ,9, 13, 16, 23};
        int arr1[] = { 2, 2, 3, 5, 5, 5, 6, 6, 6, 6, 8, 9, 12, 15, 16, 18, 22, 26, 34, 40};
        int ans = binarySearchInRange(arr1, 8);
        System.out.println(ans);
    }

    static int binarySearchInRange(int arr[], int target) {
        int found = -1;
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            start = end;
            end *= 2;
        }

        System.out.println(start + ", " + end);

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                found = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return found;
        // if (found == -1) {
        //     System.out.println("Element not found in the array");
        // } else {
        //     System.out.println("Element found in the array at index : " + found);
        // }
    }
}
