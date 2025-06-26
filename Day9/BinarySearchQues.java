public class BinarySearchQues {

    public static void main(String[] args) {

        int arr[] = { 2, 2, 3, 5, 5, 5, 6, 6, 6, 6, 8, 9, 12, 15, 16, 18, 22, 26, 34, 40};
        int arr1[] = { 2, 7, 9, 18, 24, 42 };

        // int res[] = new int[2];
        // int first = binarySearch(arr, 1, true);
        // int last = binarySearch(arr, 1, false);
        // if(first == -1){
        // System.out.println("Occurrence of targert is : "+ 0);
        // }else{
        // System.out.println("Occurrence of targert is : "+ (last - first + 1));
        // }

        // res[0] = first;
        // res[1] = last;
        // System.out.println(first+", "+ last);

        // binarySearchFloor(arr, 10);
        // binarySearchCeil(arr, 10);

        // findMinimumAbsoluteDifference(arr1, -5);

        findElementInInfiniteSortedArray(arr, 8);
        findFirstElementInInfiniteSortedArray(arr, 6);
    }

    static int binarySearch(int arr[], int target, boolean isFirst) {
        int start = 0;
        int end = arr.length - 1;
        int found = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                found = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {

                    start = mid + 1;
                }
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return found;
        // if(found == -1){
        // System.out.println("Element not found in the array");
        // }else{
        // System.out.println("Element found in the array at index : "+ found);
        // }
    }

    static void binarySearchFloor(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int found = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                found = arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
                found = arr[mid];
            } else {
                end = mid - 1;
            }
        }
        System.out.println(found);
    }

    static void binarySearchCeil(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int found = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                found = arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
                found = arr[mid];
            }
        }
        System.out.println(found);
    }

    static void findMinimumAbsoluteDifference(int arr[], int target) {

        if (arr.length == 0) {
            return;
        }

        int found = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                found = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // If element exists then answer will be 0
        int res = 0;

        // Element does not exists
        if (found == -1) {
            if (end == -1) {
                res = Math.abs(target - arr[start]);
            } else if (start == arr.length) {
                res = Math.abs(target - arr[end]);
            } else {
                int ans1 = Math.abs(target - arr[start]);
                int ans2 = Math.abs(target - arr[end]);
                res = (ans1 < ans2) ? ans1 : ans2;
            }
        }
        System.out.println(res);
    }

    static void findElementInInfiniteSortedArray(int arr[], int target){
        int range[] = findRangeInInfiniteArray(arr, target);
        System.out.println(range[0] + ", " + range[1]);

        int ans = binarySearchInRange(arr, target, range[0], range[1]);
        if (ans == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found in the array at index : " + ans);
        }
    }
    
    static void findFirstElementInInfiniteSortedArray(int arr[], int target){
        int range[] = findRangeInInfiniteArray(arr, target);
        System.out.println(range[0] + ", " + range[1]);

        int ans = binarySearchFirstOccurrence(arr, target, range[0], range[1]);
        if (ans == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found in the array at index : " + ans);
        }
    }

    static int[] findRangeInInfiniteArray(int arr[], int target) {
        int range[] = new int[2];

        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            start = end;
            end *= 2;
        }
        range[0] = start;
        range[1] = end;

        return range;
    }

    static int binarySearchInRange(int arr[], int target, int start, int end) {

        int found = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                found = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return found;
    }
    
    
    static int binarySearchFirstOccurrence(int arr[], int target, int start, int end) {

        int found = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                found = mid;
                end = mid-1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return found;
    }
}
