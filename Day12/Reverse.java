public class Reverse {
    public static void main(String[] args) {
        // reverseString2("Mukesh");
        // System.out.println(reverseWords(" My name is    Mukesh    Choudhary   "));
        System.out.println(reverseWords(" I am     from jaipur    rajasthan   "));
    }

    public static void reverseString1(String input){
        int n = input.length();

        // 1st method
        String str = "";
        for(int i = 0; i < n; i++){
            str = input.charAt(i) + str;
        }

        System.out.println(str);
    }

    public static void reverseString2(String input){
        // 2nd method
        StringBuilder str = new StringBuilder(input);
        int n = str.length();

        for(int i = 0; i < n/2; i++){
            char fChar = str.charAt(i);
            char lChar = str.charAt(n-1-i);

            str.setCharAt(i, lChar);
            str.setCharAt(n-1-i, fChar);
        }

        System.out.println(str.toString());
    }

    public static String reverseWords(String s) {
        // 1st method

        // String arr[] = s.split(" ");
        // String res = "";

        // for(int i = arr.length-1; i >= 0; i--){
        //     if (arr[i].length() == 0) {
        //         continue;
        //     }

        //     // word
        //     if (res.length() == 0) {
        //         res += arr[i];
        //     }else{
        //         res += " " + arr[i];
        //     }
        // }

        // return res;


        // 2nd method

        // String arr[] = s.split(" ");
        // StringBuilder res = new StringBuilder();

        // for(int i = arr.length-1; i >= 0; i--){
        //     // if (arr[i].length() == 0) {x
        //     if (arr[i] == ""){
        //         continue;
        //     }

        //     // word
        //     if (res.length() == 0) {
        //         res.append(arr[i]);
        //     }else{
        //         res.append(" ");
        //         res.append(arr[i]);
        //     }
        // }

        // return res.toString();


        // 3rd method 

        StringBuilder res = new StringBuilder();
        int startIndex = s.length()-1;

        while (startIndex >= 0) {
            while (startIndex >= 0 && s.charAt(startIndex) == ' ') {
                startIndex--;
            }
            if (startIndex < 0) {
                break;
            }
            
            int endIndex = startIndex;
            while (startIndex >= 0 && s.charAt(startIndex) != ' ') {
                startIndex--;
            }
            
            // word
            if (res.length() == 0) {
                res.append(s.substring(startIndex+1, endIndex+1));
            }else{
                res.append(" ");
                res.append(s.substring(startIndex+1, endIndex+1));
            }
        }
        return res.toString();
    }

    public String reverseWordsThree(String s) {
        // convert to char array
        char arr[] = s.toCharArray();
        int len = arr.length;
        int startPointer = 0;

        for (int endPointer = 0; endPointer <= len; endPointer++){
            // word will end at space or at end of string
            if(endPointer == len || arr[endPointer] == ' '){
                reverse(arr, startPointer, endPointer-1);

                // first char of next word.
                startPointer = endPointer+1;
            }
        }   
        return new String(arr);
    }

    public static void reverse(char arr[], int startPointer, int endPointer){
        while (startPointer < endPointer){
            char temp = arr[startPointer];
            arr[startPointer] = arr[endPointer];
            arr[endPointer] = temp;

            startPointer++;
            endPointer--;
        }
    }
}
