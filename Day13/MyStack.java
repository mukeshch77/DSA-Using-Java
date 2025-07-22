// Array Impl

import java.util.Scanner;
import java.util.Stack;

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

    // Check stack is empty or not
    public boolean isEmpty(){
        return top <= -1;
    }

    // Stack size
    public int size(){
        return top+1;
    }

    // Check stack top element
    public int peek(){
        if (isEmpty()) {
            System.out.println("Stack is empty now.");
            return Integer.MIN_VALUE;
        }
        return stack[top];
    }

    // Delete stack element
    public int pop(){
        int val = peek();

        if (val != Integer.MIN_VALUE) {
            top--;
        }
        return val;
    }

    // Print stack elements
    public void printStack(){
        System.out.print("Printing stack : ");
        for (int i = 0; i <= top; i++){
            System.out.print(stack[i]);
            if (i != top) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of stack : ");
        int n = sc.nextInt();

        MyStack stack = new MyStack(n);
        System.out.println("isEmpty : "+ stack.isEmpty());
        stack.push(7);
        stack.printStack();
        stack.push(5);
        stack.printStack();
        stack.push(2);
        stack.printStack();
        stack.push(9);
        stack.printStack();
        stack.push(1);
        stack.printStack();
        stack.push(4);
        stack.printStack();
        stack.push(8);
        stack.printStack();
        stack.pop();
        stack.printStack();
        System.out.println("Size : "+ stack.size());
        System.out.println("isEmpty : "+ stack.isEmpty());
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        System.out.println("Peek : "+ stack.peek());

        // JC Stack 
        Stack<Integer> myClass = new Stack<>();
        myClass.peek();
        myClass.push(7);
        myClass.pop();
        myClass.size();
        myClass.isEmpty();
    }
}
