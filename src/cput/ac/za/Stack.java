/**
 * @author Liyabona Saki
 * implementation of stack data structure using arrays
 */


package cput.ac.za;


public class Stack {
    int top = 0;
    int stack[] = new int [5];


    public void push(int data) {
        try {
            stack [top] = data;
            top++;
        }catch(Exception e) {

            System.out.println("stack overflow!");
            e.getCause();
        }
    }

    public int pop() {
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;

        return data;
    }

    public int peek() {

        return stack[top -1]; //return top elements
    }

    public void show() {
        for(int n : stack) {
            System.out.print(n+ " ");
        }

    }

}
