public class QueOnBitManipulation {
    public static void main(String[] args) {
        // printBits(53);
        int res1 = clearLSB(53, 5);
        printBits(res1);
        // int res2 = clearMSB(53, 4);
        // printBits(res2);
        // int res3 = clearMSBExclusive(53, 4);
        // printBits(res3);

        // char ch1 = convertCharToLowerCase('M');
        // System.out.println(ch1);
        // printBits((1<<5));
        // printBits(' ');

        // char ch2 = convertCharToUpperCase('b');
        // System.out.println(ch2);
        // printBits(~(1<<5));
        // printBits('_');

        // swap(-5, 2);

        int arr[] = {7, 2, 4, 2, 6, 3, 3, 1, 1, 6};
        printUniqueElement(arr);
        printTwoUniqueElements(arr);

    }

    public static void printBits(int num){
        for(int i = 7; i >= 0; i--){
            System.out.print((num >> i) & 1);
        }
        System.out.println();
        // printOddEven(num);
    }

    public static int clearLSB(int num, int bit){
        return num & ~((1<<bit+1) - 1);
    }
    
    public static int clearMSB(int num, int bit){
        return num & ((1<<bit) - 1);
    }
    
    public static int clearMSBExclusive(int num, int bit){
        return num & ((1<<bit+1) - 1);
    }

    public static char convertCharToUpperCase(int num){
        // return (char)(num & ~(1<<5));
        return (char)(num & '_');
    }
    
    public static char convertCharToLowerCase(int num){
        // return (char)(num | (1<<5));
        return (char)(num | ' ');
    }

    public static void swap(int num1, int num2){
        System.out.println("Num1 : "+ num1 +" Num2 : "+ num2);

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        
        // num1 = num1 + num2;
        // num2 = num1 - num2;
        // num1 = num1 - num2;

        System.out.println("Num1 : "+ num1 +" Num2 : "+ num2);
    }

    public static void printUniqueElement(int arr[]){
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            res = res ^ arr[i];
        }
        System.out.println(res);
    }
    
    
    public static void printTwoUniqueElements(int arr[]){
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            res = res ^ arr[i];
        }
        
        int setBit = 0;
        int bit = 0;
        while (res != 0) {
            if((res >> bit & 1) != 0){
                setBit = bit;
                break;
            }
            bit++;
        }

        int res1 = 0;
        for(int i = 0; i < arr.length; i++){
            if((arr[i] >> setBit & 1) != 0){
                res1 = res1 ^ arr[i];
            }
        }
        int num1 = res ^ res1;
        int num2 = num1 ^ res;

        System.out.println("Num1 : "+ num1 +" Num2 : "+ num2);
    }
}
