/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.linkedlist;

/**
 *
 * @author Abdul Waheed
 */
public class Linkedlist {
    
    public class Node{
    
    int data;
    Node next;
    
    Node(int data){
    
        this.data= data;
        this.next= null;
        
    }
    }
    
    private Node head;
    
    Linkedlist(){
    this.head= null;
    }
    
    public void insertAtStart(int data){
    
    Node newNode = new Node (data);
    
    newNode.next = head;
    head = newNode;
    
    }
    
    public void  AddAtPosition( int data , int position){
    
        Node newNode = new Node(data);
       
        if(position == 0){
        
           newNode.next= head; 
        
       head = newNode;
       return;}
       
       Node prev = head;
       
       
       
       for (int i = 0; i<position-1; i++){
       
           prev = prev.next;
           
       
       }
       
       newNode.next = prev.next;
       prev.next = newNode;
        
        
    }
    
    public void deleteAtStart(){
    
        
        if(head != null ){
        
          
    head = head.next;    
        }
        else{
            System.out.println("List is empty. Nothing is to delete.");
        }
  
    
    }
    public void display(){
        
        if(head== null){
        
            System.out.println("List is empty. ");
            return;
        }
        
    Node current= head;
    
    while(current!= null){
    
        System.out.print(current.data + " ->");
        current = current.next;
    }
    System.out.println("null");
    }
    
    public void deleteAtEnd(){
    
    if(head == null){
        System.out.println("List is empty.");
        return;
    }
    if (head.next == null){
    head =null;
    
    }else {
    Node current = head;
    
    
    while (current.next.next != null){
    current = current .next;
    }
    current.next = null;
    }
    }
   
    public void deleteByValue(int data) {
        
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        
        if (head.data == data) {
            head = head.next; 
            System.out.println("Deleted node with value: " + data);
            return;
        }

       
        Node current = head;
        Node previous = null;

        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Value not found in the list.");
            return;
        }

        previous.next = current.next;
        System.out.println("Deleted node with value: " + data);
    }
    
    
    // Method to search for a node with the given value
    public void search(int value) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data == value) {
                System.out.println("Value " + value + " found at position " + index);
                return;
            }
            current = current.next;
            index++;
        }
        System.out.println("Value not found.");
    }

    // Method to reverse the linked list
    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next; // Store next node
            current.next = previous; // Reverse the link
            previous = current; // Move previous to current
            current = next; // Move to next node
        }
        head = previous; // Update head to the new first node
    }

    // Method to count the number of nodes in the linked list
    public int countNodes() {
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    
    
    
    
    public void insertAtEnd(int data){
    
        Node newNode = new Node(data);
    if(head == null){
        head =newNode;
       
    }else{
    
    Node current =head;



    while (current.next != null){
    current = current.next;
    }
    current.next = newNode;
    }}
    
    
    public int size (){
    
        int size = 0;
        
        Node current = head;
        
        while (current != null){
        size++;
        current = current.next;
        
        }
        
    return size;
    }
    
    

    public static void main(String[] args) {
        Linkedlist list= new Linkedlist();
        
        list.insertAtStart(10);
        list.insertAtStart(20);
        list.AddAtPosition(25,2);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        
        System.out.println("Linked List : ");
        list.display();
        
        System.out.println("Size of the List : " + list.size());
        
        
        
        list.deleteAtStart();
        System.out.println("After deleting at start: ");
        list.display();
        
        
        list.deleteAtEnd();
        System.out.println("After deleting at end: ");
        list.display();
        
        
        list.search(40); 
        list.search(50); 

        list.reverse();
        System.out.println("List after reversing:");
        list.display();

        System.out.println("Number of nodes in the list: " + list.countNodes());

        
        
        System.out.println("After deleting by value: ");
        list.deleteByValue(25);
        list.display();
          
        System.out.println("Size of the list: " + list.size());
                
       
        
        
    
    }
}
