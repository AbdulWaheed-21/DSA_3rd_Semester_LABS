/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab05_part1;

/**
 *
 * @author Abdul Waheed
 */
public class LAB05_Part1 {

    private int[] stack;
    private int top;
    private int capacity;

    
    public LAB05_Part1(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1; 
    }

    
    public void push(int data) {
        if (top == capacity - 1) {
            System.out.println("Stack overflow! Cannot push " + data);
            return;
        }
        stack[++top] = data;
        System.out.println("Pushed " + data + " onto the stack.");
    }

    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow! Cannot pop from an empty stack.");
            return -1; 
        }
        return stack[top--];
    }

 
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! No top element.");
            return -1; 
        }
        return stack[top];
    }


    public boolean isEmpty() {
        return top == -1;
    }

    
    public int size() {
        return top + 1;
    }

   
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack contents: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LAB05_Part1 stack = new LAB05_Part1(5);

        stack.push(10);
        stack.printStack();
        
        stack.push(20);
        stack.printStack();
        
        stack.push(30);
        stack.printStack();
        
        stack.push(40);
        stack.printStack();
        
        stack.push(50);
        stack.printStack();
        
       
        stack.push(60);
        
        System.out.println("Top element: " + stack.peek());
        stack.printStack();
        
        System.out.println("Popped: " + stack.pop());
        stack.printStack();
        
        System.out.println("Popped: " + stack.pop());
        stack.printStack();
        
      
        stack.pop();
        stack.pop();
        stack.pop(); 

        
        stack.printStack();
    }
}
