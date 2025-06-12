
public class operators {
    public static void main(String[] args) {
        // unary
        // int a = 10;
        // a++;
        // System.out.println(a);//11
        // a--;
        // System.out.println(a);//10
        // ++a;
        // System.out.println(a);//11
        // --a;
        // System.out.println(a);//10

        // System.out.println(a++);//10

        // int op = 15;
        // int ans = op++ + ++op - --op - op++;
        // System.out.println(op + " " + ans);

        // boolean correct = true;
        // System.out.println(correct);
        // System.out.println(!correct);

        // int val1 = 10; // pos -> -(val+1) -> -11
        // System.out.println(~val1);
        
        // int val2 = -10; // neg -> -(val+1) -> 9
        // System.out.println(~val2);

        // 0110001111 >> 2
        // 0001100011

        // 0110001111 << 2
        // 1000111100

        boolean vall1 = true;
        boolean vall2 = true;
        boolean vall3 = false;
        boolean vall4 = false;

        int test = 10;
        boolean ans = (++test == 11);
        System.out.println(ans);
        System.out.println( vall3 && (++test == 11) );
        System.out.println(test);

        System.out.println( vall1 || (++test == 11) );
        System.out.println(test);

        int res = (6>5)?(test++):(test--);
        System.out.println(test); //12
        System.out.println(res); //11

        int x11 = 5;

        int x22 = (27 + 40) - x11++ * 5 / 2 + 9 % 100;
        System.out.println(x22);
        
    }
}
