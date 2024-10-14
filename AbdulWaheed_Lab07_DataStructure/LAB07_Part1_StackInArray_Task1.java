/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab07_part1_stackinarray_task1;

/**
 *
 * @author Abdul Waheed
 */
public class LAB07_Part1_StackInArray_Task1 {
private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public LAB07_Part1_StackInArray_Task1(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

  
    public void enqueue(int data) {
        if (size == capacity) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity; 
        queue[rear] = data;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        int data = queue[front];
        front = (front + 1) % capacity; 
        size--;
        return data;
    }

  
    public int peek() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

  
    public boolean isEmpty() {
        return size == 0;
    }


    public int size() {
        return size;
    }

    public static void main(String[] args) {
        LAB07_Part1_StackInArray_Task1 queue = new LAB07_Part1_StackInArray_Task1(5);

        
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Front element after dequeue: " + queue.peek()); 
    }
}
