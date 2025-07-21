public class ReverseString {
    public static void main(String[] args) {
        reverseString2("Mukesh");
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
}
