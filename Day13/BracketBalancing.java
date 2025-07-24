import java.util.Stack;

public class BracketBalancing {
    public static void main(String[] args) {
        // System.out.println(countRev("}{{}}{{{"));
        System.out.println(countRevOpti("}{{}}{{{"));
    }

    public static int countRev(String s) {

        if (s.length() % 2 != 0) {
            return -1;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '{') {
                stack.push(ch);
            } else {
                // insert incase of invalid pair }} close comes before open.
                if (stack.isEmpty() || stack.peek() == '}') {
                    stack.push(ch);
                } else {
                    // pop in case of valid pair
                    stack.pop();
                }
            }
        }
        int ans = 0, open = 0, close = 0;
        while (!stack.isEmpty()) {
            char top = stack.pop();
            if (top == '{') {
                open++;
            } else {
                close++;
            }
        }
        ans = (int)(Math.ceil(open/2.0) + Math.ceil(close/2.0));
        return ans;
    }
    
    public static int countRevOpti(String s) {

        if (s.length() % 2 != 0) {
            return -1;
        }
        // Stack<Character> stack = new Stack<>();
        int ans = 0, open = 0, close = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '{') {
                open++;
            } else {
                if (open <= 0) {
                    close++;
                } else {
                    open--;
                }
            }
        }
        ans = (int)(Math.ceil(open/2.0) + Math.ceil(close/2.0));
        return ans;
    }

    public int minSwaps(String s) {
        // Stack<Character> stack = new Stack<>();
        // for(int i = 0; i < s.length(); i++){
        //     char ch = s.charAt(i);
        //     if(ch == '['){
        //         stack.push(ch);
        //     }else{
        //         if(stack.isEmpty() || stack.peek() == ']'){
        //             stack.push(ch);
        //         }else{
        //             stack.pop();
        //         }
        //     }
        // }
        // int res = stack.size()/2;
        // return (res+1)/2;

        int open = 0, close = 0;

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '[') {
                open++;
            }else{
                if (open <= 0) {
                    close++;
                }else{
                    open--;
                }
            }
        }
        return (open + 1) / 2;
    }

    
}
