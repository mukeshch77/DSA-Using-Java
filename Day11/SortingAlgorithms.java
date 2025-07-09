public class SortingAlgorithms {
    public static void main(String[] args) {
        int arr[] = {2, 7, 1, 5, 0, 1, 12};
        // printArray(arr, " Original array");
        // insertionSort(arr);   
        // printArray(arr, " Sorted array");
        
        printArray(arr, " Original array");
        selectionSort(arr);   
        printArray(arr, " Sorted array");
    }

    public static void printArray(int arr[], String message){
        System.out.println("printing" + message);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if (i!=arr.length-1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i-1;
            // shifting logic
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }

            // place the key at j+1
            arr[j+1] = key;
        }
    }

    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n-1; i++){
            int minEl = arr[i];
            int minIndex = i;
            for(int j = i+1; j < n-1; j++){
                if (arr[j] < minEl) {
                    minEl = arr[j];
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }
    
    public static void biDirectionalselectionSort(int arr[]){
        int n = arr.length;
        int k = n-1;
        for(int i = 1; i < k; i++){
            int minEl = arr[i];
            int minIndex = i;
            int maxEl = arr[i];
            int maxIndex = i;
            for(int j = i+1; j <= k; j++){
                if (arr[j] < minEl) {
                    minEl = arr[j];
                    minIndex = j;
                } else if (arr[j] > maxEl) {
                    maxEl = arr[j];
                    maxIndex = j;
                }
            }
            //swap min elements
            swap(arr, i, minIndex);
            //swap max elements
            if (maxEl == arr[minIndex]) {
                swap(arr, k, minIndex);
            }else{
                swap(arr, k, maxIndex);
            }
            k--;
        }
    }

    public static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
