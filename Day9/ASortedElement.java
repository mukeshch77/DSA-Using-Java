public class ASortedElement {

    public static void main(String[] args) {
        int nums[] = {2, 2, 4, 4, 7, 8, 8, 9, 9};
        int ans = singleNonDuplicate(nums);
        System.out.println(ans);
    }

    static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-2;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // left half
            if(nums[mid] == nums[mid^1]){
                start = mid + 1;
            }else{// right half
                end = mid - 1;
            }          
        }
        return nums[start];
    }
}
