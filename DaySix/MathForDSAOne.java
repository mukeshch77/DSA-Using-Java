public class MathForDSAOne {
    public static void main(String[] args) {
        decimalToAnyBase(7, 2);
        anyBaseToDecimal(101, 2);
        // findEvenOdd(5);
        // reverseNum(3567);
        power(10, 3);
        fastExponentiation(2, 4);
    }

    static void decimalToAnyBase(int decNum, int base){
        int res = 0;
        int power = 0;

        while(decNum > 0){
            int rem = decNum % base;
            // res += rem * Math.pow(10, power);
            res += rem * power(10, power);
            power++;
            decNum /= base;
        }
        System.out.println(res);
    }
    
    static void anyBaseToDecimal(int binaryNum, int base){
        int res = 0;
        int power = 0;

        while(binaryNum > 0){
            int unitDigit = binaryNum % 10;
            // res += unitDigit * Math.pow(base, power);
            res += unitDigit * power(base, power);
            power++;
            binaryNum /= 10;
        }
        System.out.println(res);
    }

    static void findEvenOdd(int num){
        if(num % 2 == 0){
            System.out.println("Given number is even : "+ num);
        }else{
            System.out.println("Given number is odd : "+ num);
        }
    }

    static void reverseNum(int num){
        int revNum = 0;

        while(num > 0){
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }
        System.out.println(revNum);
    }

    static double power(int num, int pow){
        int res = 1;
        for(int i = 0; i < pow; i++){
            res = res * num;
        }
        // System.out.println(num + " to the power " + pow + " is : " + res);
        return res;
    }

    static double fastExponentiation(int num, int power){
        double res = 1;
        while (power > 0){
            if(power % 2 !=0){
                res = res *num;
            }
            power /= 2;
            num = num *num;
        }
        System.out.println(res);
        return res;
    }
}
