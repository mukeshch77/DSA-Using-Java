public class JumpSearch {

    public static void main(String[] args) {
        int arr1[] = {2, 4, 6, 7, 8, 11, 18, 22, 29, 35};
        int arr2[] = {2, 2, 2};
        // int index = jumpSearch(arr, 35);
        // int index = ternarySearch(arr, 12);
        // int index = exponentialSearch(arr, 299);
        int index = interPolationSearch(arr2, 2); // log2(log2N)

        if (index == -1) {
            System.out.println("Element not found");
        }else{
            System.out.println("Found element at index "+ index);
        }
    }

    static int jumpSearch(int arr[], int target){
        int n = arr.length;
        int blockSize = (int)Math.sqrt(n);
        int satrtIndex = 0;
        int endIndex = blockSize;

        while (endIndex < n && arr[endIndex] <= target) {
            // Jump the non-potential blocks..
            satrtIndex = endIndex;
            endIndex += blockSize;

            if (endIndex > n) {
                endIndex = n;
            }
        }
        int res = -1;
        // Apply linear search
        for(int i = satrtIndex; i < endIndex; i++){
            if (target == arr[i]) {
                res = i;
            }
        }
        return res;
    }

    public static int ternarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;

        int index = -1;

        while (start <= end) {
            int mid1 = start + (end - start) / 3;
            int mid2 = end - (end - start) / 3;

            if(target <= arr[mid1]){
                if(target == arr[mid1]){
                    index = mid1;
                    break;
                }
                end = mid1 - 1;
            }else if(target >= arr[mid2]){
                if(target == arr[mid2]){
                    index = mid2;
                    break;
                }
                start = mid2 + 1;
            }else {
                start = mid1 + 1;
                end = mid2 - 1;
            }
        }
        return index;
    }

    public static int exponentialSearch(int arr[], int target){
        if(arr[0] == target){
            return 0;
        }

        int i = 1;
        int n = arr.length;

        // enclose the target
        while(i < n && arr[i] <= target){
            i = 2 * i;
        }
        int end = Math.min(i, n-1);
        int index = binarySearchInRange(arr, target, i/2, end);

        return index;
    }

    static int binarySearchInRange(int arr[], int target, int start, int end) {

        int found = -1;
        
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
    }

    static int interPolationSearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        int index = -1;

        while (start <= end && target >= arr[start] && target <= arr[end]) {

            if (arr[start] == arr[end]) {
                if (arr[start] == target) {
                    index = start;
                }
                break;
            }

            int pos = start + (target - arr[start] * (end - start) / (arr[end] - arr[start]));
            if (arr[pos] == target){
                index = pos;
                break;
            }else if (target < arr[pos]) {
                end = pos - 1;
            }else{
                start = pos + 1;
            }
        }
        return index;
    }
}