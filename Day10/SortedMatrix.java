public class SortedMatrix {
    public static void main(String[] args) {
        // int matrix1[][] = {{1, 3, 5}, {2, 6, 9}, {3, 6, 9}};
        int matrix2[][] = {{1, 3, 5}, {7, 10, 13}, {16, 22, 25}};
        // int median = median(matrix, 3, 3);
        boolean ans = searchMatrix(matrix2, 16);
        System.out.println(ans);
    }

    static int median(int matrix[][], int R, int C){
        // total elements
        int N = R*C;
        int medianIndex = N/2;
        int start = 1;
        int end = 2000;

        while (start <= end) {
            int assumedMedian = start + (end - start) / 2;
            // No of elements less than assumed median.
            // k -> no of smaller element
            int k = findSmallerElements(matrix, assumedMedian);

            if (k <= medianIndex) {
                start = assumedMedian + 1;
            }else{
                end = assumedMedian - 1;
            }
        }
        return start;
    }

    static int findSmallerElements(int matrix[][], int assumedMedian){
        int noOfSmallerElements = 0;
        // traverse row by row
        for (int i=0; i<matrix.length; i++){
            // matrix[i] -> 0,1,2
            // apply binary search on matrix[i]
            // int arr[] = matrix[i]

            int start = 0;
            int end = matrix[i].length-1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if(matrix[i][mid] <= assumedMedian){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
            noOfSmallerElements += start;
        }
        return noOfSmallerElements;
    }

    static boolean searchMatrix(int matrix[][], int target){
        if (matrix.length == 0) {
            return false;
        }

        int m = matrix.length; // rows
        int n = matrix[0].length; // col
        int start= 0;
        int end = m*n-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int r = mid / n;
            int c = mid % n;
            int val = matrix[r][c];

            if (val == target) {
                return true;
            }else if (val < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }

    static boolean searchMatrixTwo(int matrix[][], int target){
        if (matrix.length == 0) {
            return false;
        }
        int Rows = matrix.length;
        int Col = matrix[0].length;
        int r = 0;
        int c = Col-1;

        while (r < Rows && c >= 0) {
            if (matrix[r][c] == target) {
                return true;
            } else if (target < matrix[r][c]) {
                c--;
            } else {
                r++;
            }
        }
        return false;
    }
}
