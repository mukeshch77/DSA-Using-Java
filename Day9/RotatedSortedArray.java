    public class RotatedSortedArray {
    public static void main(String[] args) {
        int arr1[] = {6, 9, 11, 18, 1, 2, 5};
        int arr2[] = {19, 2, 19, 19, 19, 19};
        int arr3[] = {19, 19, 19, 2, 19, 19};

        // boolean ans1 = findInRotatedArrayWithDuplicates(arr2, 2);
        // System.out.println(ans1);
        
        // int ans2 = findMinInRotatedSortedArray(arr1);
        // System.out.println(ans2);
        
        // int ans3 = findMinInRotatedSortedArrayWithDuplicates(arr3);
        // System.out.println(ans3);
        
        int ans4 = findKthRotation(arr1);
        System.out.println(ans4);
    }

    static boolean findInRotatedArrayWithDuplicates(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target == nums[mid]){
                return true;
            }

            /* if start, mid and end all are same then we can't guarentee which part is sorted so we will trim down the space */
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start++;
                end--;
            }else if(nums[start] <= nums[mid]){
                // check ans is left side or not??
                if(target >= nums[start] && target < nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{// right side is sorted array

                // check ans is left side or not??
                if(target > nums[mid] && target <= nums[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }   
            }
        }
        return false;
    }

    static int findMinInRotatedSortedArray(int nums[]){
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int minEle = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[start] <= nums[mid]){
                minEle = Math.min(minEle, nums[start]);
                start = mid+1;
            }else{
                minEle = Math.min(minEle, nums[mid]);
                end = mid-1;
            }
        }
        return minEle;
    }
    
    static int findMinInRotatedSortedArrayWithDuplicates(int nums[]){
        // QuesNo : 154
        int start = 0;
        int end = nums.length-1;
        int minEle = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + (end - start) / 2;
            minEle = Math.min(minEle, nums[mid]);

            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start++;
                end--;
            }else if(nums[start] <= nums[mid]){
                minEle = Math.min(minEle, nums[start]);
                start = mid+1;
            }else{
                minEle = Math.min(minEle, nums[mid]);
                end = mid-1;
            }
        }
        return minEle;
    }

    static int findKthRotation(int nums[]){
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int minEle = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[start] <= nums[mid]){
                // minEle = Math.min(minEle, nums[start]);
                if(nums[start] < minEle){
                    minEle = nums[start];
                    minIndex = start;
                }
                start = mid+1;
            }else{
                // minEle = Math.min(minEle, nums[mid]);
                if(nums[mid] < minEle){
                    minEle = nums[mid];
                    minIndex = mid;
                }
                end = mid-1;
            }
        }
        return minIndex;
    }
}
