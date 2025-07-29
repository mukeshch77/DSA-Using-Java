import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        long[] arr = {2, 1, 7, 5, 9, 11, 9};
         long ans[] = nextLargestElement(arr, 7);

        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i]);
            if (i != ans.length-1) {
                System.out.print(", ");
            }
        }
    }
    public static long[] nextLargestElement(long[] arr, int n){
        Stack<Long> stack = new Stack<>();
        long[] res = new long[n];

        for(int i = n-1; i >= 0; i--){
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = -1;
            }else{
                res[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
    }
}
