public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = {2, 3, 5, 7, 9, 12, 15};
        // binarySearch(arr, 12);

        int arr1[] = {22, 18, 15, 11, 9, 7, 5, 3};
        binarySearchDesc(arr1, 50);
        binarySearchOrderAgnostic(arr, 75);
    }

    static void binarySearchInc(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        int found = -1;
        
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                found = mid;
                break;
            }else if (arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        if(found == -1){
            System.out.println("Element not found in the array");
        }else{
            System.out.println("Element found in the array at index : "+ found);
        }
    }
    
    static void binarySearchDesc(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        int found = -1;
        
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                found = mid;
                break;
            }else if (arr[mid] < target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        if(found == -1){
            System.out.println("Element not found in the array");
        }else{
            System.out.println("Element found in the array at index : "+ found);
        }
    }
    
    static void binarySearchOrderAgnostic(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        if(arr[start] <= arr[end]){
            binarySearchInc(arr, target);
        }else{
            binarySearchDesc(arr, target);
        }
    }
}
