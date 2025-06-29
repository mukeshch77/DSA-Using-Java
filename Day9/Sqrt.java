public class Sqrt {
    public static void main(String[] args) {
        // int ans = mySqrt(15);
        int ans = countSquares(3);
        System.out.println(ans);
    }

    static int mySqrt(int x) {
        int start = 0;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid <= x / mid) {
                if (x % mid == 0 && mid == x / mid) {
                    return mid;
                }
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    static int countSquares(int N){
        int sqroot = mySqrt(N);
        return sqroot - 1;
    }
}
