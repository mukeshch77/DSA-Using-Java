public class AllocatePages {

    public static void main(String[] args) {
        int books[] = {12, 34, 67, 90};
        int ans = bookMinimumPageAllocation(books, 2);
        System.out.println(ans);
    }

    public static int bookMinimumPageAllocation(int books[], int students){
        if(books.length < students){
            return -1;
        }

        // range will be max of array and sum of array
        int start = Integer.MIN_VALUE; // for finding max element
        int end = 0; //sum of array.


        for(int i = 0; i < books.length; i++){
            if(books[i] > start){
                start = books[i];
            }
            end += books[i];
        }
        int res = -1;

        while (start <= end) {
            // max pages that can be allocated to single student.
            int mid = start + (end - start) / 2;

            // if allocation is possible then minimize the number of pages
            if(isAllocationPossible(books, mid, students)){
                res = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return res;
    }

    static boolean isAllocationPossible(int books[], int maxPages, int students){
        int curStudent = 1;
        int pages = 0;
        for ( int i = 0; i < books.length; i++){
            pages += books[i];
            //if pages exceed maxPages
            if(pages > maxPages){
                // allocate to next
                curStudent++;
                pages = books[i];
            }

            if(curStudent > students){
                return false;
            }
        }
        return true;
    }
}