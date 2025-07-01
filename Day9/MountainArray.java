public class MountainArray {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 4, 3, 1};
        boolean res = validMountainArray(arr);
        System.out.println(res);
    }

    static boolean validMountainArray(int arr[]){
        int index = 0;
        int n = arr.length;

        //find all increasing seq (find the peak)
        while (index < n-1){
            if(arr[index] < arr[index+1]){
                index++;
            }else{
                break;
            }
        }
        if(index == 0 || index == n-1){
            return false;
        }

        //find all decreasing seq 
        while (index < n-1){
            if(arr[index] > arr[index+1]){
                index++;
            }else{
                break;
            }
        }
        return (index == n-1);
    }
}
