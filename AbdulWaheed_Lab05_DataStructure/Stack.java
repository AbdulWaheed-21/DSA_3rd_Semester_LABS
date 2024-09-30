/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.stack;

/**
 *
 * @author Abdul Waheed
 */
public class Stack {
    
    class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
    
    private Node top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

   
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

  
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int poppedData = top.data;
        top = top.next;
        size--;
        return poppedData;
    }

    
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

  
    public boolean isEmpty() {
        return top == null;
    }

    
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek()); 
        System.out.println("Stack size is: " + stack.size()); 
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Stack size is now: " + stack.size()); 
        System.out.println("Is stack empty? " + stack.isEmpty()); 
    }
}
    
    
    
    
 /* private Node top;
    private int size;
    
    
    public class Node{
    
        int data;
        Node next;
        

        public Node(int data) {
            this.data= data;
            this.next= null;
           
        }
        
       
       
    }
    
    public Stack() {
        this.top = null;
        this.size = 0;
    }

    
    public void push(int data){
    
    Node newNode = new Node(data);
    
    
  
        
        newNode.next=top;
        top=newNode;
        size++;
        
    
    }
    
    public void pop(){
    
       if(isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int poppedData = top.data;
        top = top.next;
        size--;
        return poppedData;

        
        
        }
    
        
        
    
    }
    
    

    public static void main(String[] args) {
       
        
        
        
    }
}*/
