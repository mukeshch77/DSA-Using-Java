import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        long[] arr = { 2, 1, 7, 5, 9, 11, 9 };
        long ans[] = nextLargestElement1(arr, 7);
        int[] arr1 = { 2, 1, 7, 5, 9, 11, 9 };
        int ans2[] = nextLargestElement2(arr1);

        for (int i = 0; i < ans2.length; i++) {
            System.out.print(ans2[i]);
            if (i != ans2.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static long[] nextLargestElement1(long[] arr, int n) {
        Stack<Long> stack = new Stack<>();
        long[] res = new long[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
    }

    public static int[] nextLargestElement2(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] res = new int[n];

        for (int i = 2 * n - 1; i >= 0; i--) {
            System.out.println("Index is "+ i);
            System.out.println("Index considered is "+ (i%n));
            System.out.println("Element is "+ nums[i%n]);
            while (!stack.isEmpty() && stack.peek() <= nums[i % n]) {
                System.out.println("Popped : "+ stack.peek());
                stack.pop();
            }
            if (i < n) {
                if (stack.isEmpty()) {
                    res[i] = -1;
                } else {
                    res[i] = stack.peek();
                }
                System.out.println("Stored result is "+ res[i]);
            }
            System.out.println("Pushed : "+ nums[i%n]);
            stack.push(nums[i%n]);
        }
        return res;
    }
}
