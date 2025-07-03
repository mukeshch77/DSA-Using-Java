public class MatrixTransposeAndRotate {
    public static void main(String[] args) {
        int mat[][] = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};
        transpose(mat, 4);
        
    }

        static void swap(int matrix[][], int i, int j){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }

        static void transpose(int matrix[][], int n){
            System.out.println("Before tarnspose :->");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
            
            for(int i = 0; i < n; i++){
                for(int j = 0; j < i; j++){
                    swap(matrix, i, j);
                }
            }
            
            System.out.println("Before tarnspose :->");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        transpose(matrix, n);

        // reverse rows -> clockwise
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
        // reverse rows -> clockwise
        for(int i=0; i<n/2; i++){
            for(int j=0; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-i][j];
                matrix[n-1-i][j] = temp;
            }
        }
    }
}
