public class AllSubStrings {
    public static void main(String[] args) {
        allSubStrings("abc");
        
    }

    public static void allSubStrings(String input){
        int n = input.length();

        for(int sIndex = 0; sIndex < n; sIndex++){
            for(int eIndex = sIndex; eIndex <= n; eIndex++){
                System.out.println(input.substring(sIndex, eIndex));
            }
        }
    }
}
