// Array Impl

import java.util.Scanner;

public class MyStack {
    int stack[];
    int top;
    int size;

    public MyStack(int stackSize){
        stack = new int[stackSize];
        size = stackSize;
        top = -1;
    }

    // Insert
    public void push(int ele){
        if (top >= size-1) {
            System.out.println("Stack is full - overflow");
            return ;
        }
        top++;
        stack[top] = ele;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        MyStack stack = new MyStack(n);

        
    }
}
