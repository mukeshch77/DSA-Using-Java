import java.util.Stack;

public class HelpClassmates {
    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 2, 25};
        int[] ans = helpClassmates(arr, 5);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]);
            if (i != ans.length-1) {
                System.out.print(", ");
            }
        }
    }
    public static int[] helpClassmates(int arr[], int n){
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];

        for(int i = n-1; i >= 0; i--){
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
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
