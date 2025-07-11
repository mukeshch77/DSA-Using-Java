public class SortingAlgorithms {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 1, 5, 0, 1, 12 };
        // printArray(arr, " Original array");
        // insertionSort(arr);
        // printArray(arr, " Sorted array");

        // printArray(arr, " Original array");
        // selectionSort(arr);
        // printArray(arr, " Sorted array");

        // printArray(arr, " Original array");
        // biDirectionalselectionSort(arr);
        // printArray(arr, " Sorted array");

        // printArray(arr, " Original array");
        // bubbleSort(arr);
        // printArray(arr, " Sorted array");
        
        // printArray(arr, " Original array");
        // brickSort(arr);
        // printArray(arr, " Sorted array");
        
        // printArray(arr, " Original array");
        // int res[] = countingSort(arr);
        // printArray(res, " Sorted array");
        
        // printArray(arr, " Original array");
        // radixSort(arr);
        // printArray(arr, " Sorted array");
        
        printArray(arr, " Original array");
        pigeonholeSort(arr);
        printArray(arr, " Sorted array");
    }

    public static void printArray(int arr[], String message) {
        System.out.println("printing" + message);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // shifting logic
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // place the key at j+1
            arr[j + 1] = key;
        }
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            int minEl = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[j] < minEl) {
                    minEl = arr[j];
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void biDirectionalselectionSort(int arr[]) {
        int n = arr.length;
        int k = n - 1;
        for (int i = 0; i < k; i++) {
            int minEl = arr[i];
            int minIndex = i;
            int maxEl = arr[i];
            int maxIndex = i;
            for (int j = i + 1; j <= k; j++) {
                if (arr[j] < minEl) {
                    minEl = arr[j];
                    minIndex = j;
                } else if (arr[j] > maxEl) {
                    maxEl = arr[j];
                    maxIndex = j;
                }
            }
            System.out.println("Max ele -->" + maxEl + " at index " + maxIndex);
            System.out.println("swapped with index -->" + k);
            System.out.println("Min ele -->" + minEl + " at index " + minIndex);
            System.out.println("swapped with index -->" + i);
            // swap min elements
            swap(arr, i, minIndex);
            // swap max elements
            if (maxEl == arr[minIndex]) {
                swap(arr, k, minIndex);
            } else {
                swap(arr, k, maxIndex);
            }
            printArray(arr, " mid logic");
            k--;
        }
    }

    public static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        // passes = n-2
        for (int i = 0; i <= n - 2; i++) {
            boolean flag = false;
            for (int j = 0; j <= n - 2 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    flag = true;
                }
            }
            if (flag == false) {
                System.out.println("No swaps");
                break;
            }
            printArray(arr, "Array after pass " + i);
        }
    }

    public static void brickSort(int arr[]) {
        int n = arr.length;
        boolean isSorted = false;

        while (!isSorted) {
            boolean flag = false;
            // even index swapping
            for (int i = 0; i <= n - 2; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    flag = true;
                }

            }
            // odd index swapping
            for (int i = 1; i <= n - 2; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    flag = true;
                }

            }
            if (flag == false) {
                isSorted = true;
            }
        }
    }

    public static int[] countingSort(int arr[]){
        // find k --> max element
        int n = arr.length;
        int k = Integer.MIN_VALUE;
        int res[] = new int[n];

        for(int i=0; i<n; i++){
            if (arr[i]>k) {
                k = arr[i];

            }
        }
        if (k==Integer.MIN_VALUE) {
            System.out.println("Empty value");
            return res;
        }

        int countArr[] = new int[k+1];

        // find the frequency
        for(int i=0; i<n; i++){
            int index = arr[i];
            countArr[index]+=1;
        }
        // find cumulative frequency
        for(int i=1; i<=k; i++){
            countArr[i] += countArr[i-1];
        }
        // find the sorted array
        for(int i=n-1; i>=0; i--){
            int val = arr[i];
            // a-- & --a
            int countVal = --countArr[val];
            res[countVal] = val;
        }
        return res;
    }
    
    public static void countingSortWithDigit(int arr[], int digit){
        // find k --> max element
        int n = arr.length;
        int k = 9;
        int res[] = new int[n];

        int countArr[] = new int[k+1];

        // find the frequency
        for(int i=0; i<n; i++){
            int index = (arr[i]/digit) % 10;
            countArr[index]+=1;
        }
        // find cumulative frequency
        for(int i=1; i<=k; i++){
            countArr[i] += countArr[i-1];
        }
        // find the sorted array
        for(int i=n-1; i>=0; i--){
            int val = arr[i];
            System.out.println("Value is "+ val);
            // a-- & --a
            int countIndex = (arr[i]/digit) % 10;
            System.out.println("Index in count array "+ countIndex);
            int countVal = --countArr[countIndex];
            System.out.println("Element "+ val +" placed at index "+ countVal);
            res[countVal] = val;
        }
        // copy back to original array
        for(int i=0; i<n; i++){
            arr[i] = res[i];
        }
    }

    public static void radixSort(int arr[]) {
        int n = arr.length;
        int maxEl = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if (arr[i]>maxEl) {
                maxEl = arr[i];

            }
        }
        if (maxEl==Integer.MIN_VALUE) {
            System.out.println("Empty value");
            return;
        }

        for(int digit=1; maxEl/digit>0; digit*=10){
            countingSortWithDigit(arr, digit);
        }
    }

    public static void pigeonholeSort(int arr[]){
        int n = arr.length;
        int maxEl = Integer.MIN_VALUE;
        int minEl = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if (arr[i]>maxEl) {
                maxEl = arr[i];
            }
            if (arr[i]<minEl) {
                minEl = arr[i];
            }
        }
        if (maxEl==Integer.MIN_VALUE || minEl==Integer.MAX_VALUE) {
            System.out.println("Empty value");
            return;
        }

        int size = maxEl-minEl+1;
        int pigeonHole[] = new int[size];

        // find the count
        for (int i=0; i<n; i++){
            int index = arr[i] - minEl;
            pigeonHole[index]++;
        }

        int insertionIndex = 0;
        //fill the original array
        for (int j=0; j<size; j++){
            while (pigeonHole[j] > 0) {
                arr[insertionIndex] = j+minEl;
                insertionIndex++;
                pigeonHole[j]--;
            }
        }
    }
}
