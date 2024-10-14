/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab07_part2_stackinsinglill_task2;

/**
 *
 * @author Abdul Waheed
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class LAB07_Part2_StackInSingliLL_Task2 {

    private ListNode front;
    private ListNode rear;
    private int size;

    public LAB07_Part2_StackInSingliLL_Task2() {
        front = null;
        rear = null;
        size = 0;
    }

    
    public void enqueue(int data) {
        ListNode newNode = new ListNode(data);
        if (rear == null) {
            // Queue is empty
            front = newNode;
            rear = newNode;
        } else {
          
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

   
    public int dequeue() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty");
        }
        int data = front.val;
        front = front.next;
        if (front == null) {
    
            rear = null;
        }
        size--;
        return data;
    }

    
    public int peek() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.val;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        LAB07_Part2_StackInSingliLL_Task2 queue = new LAB07_Part2_StackInSingliLL_Task2();

      
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Front element: " + queue.peek()); 
        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Front element after dequeue: " + queue.peek()); 
    }
}