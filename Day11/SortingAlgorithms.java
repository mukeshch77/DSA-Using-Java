package Day11;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int arr[] = {2, 7, 1, 5, 0, 1, 12};
        insertionSort(arr);
        
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
}
