import java.util.Arrays;

public class MathForDSATwo {
    public static void main(String[] args) {
        // countDigit(2385);
        // countDigitViaLog(774);
        // armstrongNumber(121);
        // printAllDivisors(36);
        // primeNumbers(12);
        // sieveAlgorithm(40);
        // GCD(24, 36);
        // euclideanGCD(24, 36);
        // efficientEuclideanGCD(24, 36);
        // LCM(24, 36);
        // fastExponentiation(35636365, 5, 1000);
        factorial(5);
    }

    static void countDigit(int num) {
        if (num == 0) {
            System.out.println("1 digit in this given number.");
            return;
        }

        int count = 0;

        while ((num > 0)) {
            num /= 10;
            count++;
        }

        System.out.println(count + " digit in this given number.");
    }

    static void countDigitViaLog(int num) {
        if (num == 0) {
            System.out.println("1 digit in this given number.");
            return;
        }

        // int count = (int) ((int) Math.log(num) / Math.log(10)) + 1;
        int count = (int) Math.log10(num) + 1;
        System.out.println(count + " digit in this given number.");
    }

    static void armstrongNumber(int num) {
        int res = 0;
        int temp = num;

        while (num > 0) {
            int digit = num % 10;
            res = res + (int) Math.pow(digit, 3);
            num /= 10;
        }

        if (temp == res) {
            System.out.println("Given number is armstrong Number : " + res);
        } else {
            System.out.println("Given number is not armstrong Number : " + res);
        }
    }

    static void printAllDivisors(int num) {
        int counter = 1;
        // int sqRoot = (int) Math.sqrt(num);
        int sqRoot = (int) newtonRaphsonSqRoot(num);

        // System.out.println("---------"+ sqRoot+"-------");

        while (counter <= sqRoot) {
            if (num % counter == 0) {
                System.out.println(counter + " counter is divisor of " + num);
                int otherNum = num / counter;
                if (otherNum != counter) {
                    System.out.println(otherNum + " counter is divisor of " + num);
                }
            }
            counter++;
        }
    }

    static void primeNumbers(int num) {
        int counter = 2;
        int sqRoot = (int) Math.sqrt(num);

        while (counter <= sqRoot) {
            if (num % counter == 0) {
                System.out.println("Given number is not a prime number -> " + num);
                return;
            }
            counter++;
        }

        System.out.println("Given number is a prime number -> " + num);

    }

    public static void sieveAlgorithm(int num) {
        boolean arr[] = new boolean[num + 1];
        Arrays.fill(arr, true);
        int counter = 2;

        while (counter <= num) {
            if (arr[counter] == true) {
                for (int factor = counter + counter; factor <= num; factor += counter) {
                    arr[factor] = false;
                }
            }
            counter++;

        }
        for (int i = 2; i <= num; i++) {
            if (arr[i] == true) {
                System.out.println(i + " : " + arr[i]);
            }
        }
    }

    public static double newtonRaphsonSqRoot(int num) {
        double tol = 0.0001;
        double root;
        double X = num;

        while (true) {
            root = 0.5 * (X + (num / X));
            double ans = X - root;

            if (ans < tol) {
                break;
            }
            X = root;
        }
        // System.out.println(root);
        return root;
    }

    public static void GCD(int num1, int num2) {
        int min = (num1 <= num2) ? num1 : num2;

        while (min > 0) {
            if (num1 % min == 0 && num2 % min == 0) {
                System.out.println("GCD is : " + min);
                return;
            }
            min--;
        }
        int max = (num1 >= num2) ? num1 : num2;
        System.out.println("GCD is : " + max);
    }

    public static void euclideanGCD(int num1, int num2) {

        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }
        int res = num1;
        if (num1 == 0) {
            res = num2;
        }
        System.out.println("GCD is " + res);
    }

    public static int efficientEuclideanGCD(int num1, int num2) {

        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 %= num2;
            } else {
                num2 %= num1;
            }
        }
        int res = num1;
        if (num1 == 0) {
            res = num2;
        }
        // System.out.println("GCD is "+ res);
        return res;
    }

    public static void LCM(int num1, int num2) {

        int res = (num1 * num2) / efficientEuclideanGCD(num1, num2);
        System.out.println("Lcm is : " + res);
    }

    static double fastExponentiation(long num, long power, long limit) {
        double res = 1;
        while (power > 0) {
            if (power % 2 != 0) {
                res = (res * (num % limit)) % limit;
                // res = res*num;
            }
            power /= 2;
            num = ((num % limit) * (num % limit)) % limit;
            // num = num*num;
        }

        System.out.println(res);
        return res;
    }

    static void factorial(int num){
        double res = 1;
        while (num>1){
            res *= num;
            num--;
        }
        System.out.println(res);
    }

    static void findTrailingZerosInFactorial(int num){
        double res = 0;
        for(int i = 5;i<=num;i=i*i){
            res = res + Math.floor(num/i);
        }
        System.out.println(res);
    } 
}
