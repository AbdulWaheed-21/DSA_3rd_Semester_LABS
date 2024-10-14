/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab07_part1_doublyll;

/**
 *
 * @author Abdul Waheed
 */
public class LAB07_PART1_DoublyLL {
class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    
}
    private Node head;
    private Node tail;
    private int size;

    public LAB07_PART1_DoublyLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Insertion Operations
    public void addAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void addAtPosition(int data, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            addAtStart(data);
        } else if (position == size) {
            addAtEnd(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < position; i++) {
                current = current.next;
            }
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    // Deletion Operations
    public void deleteFromStart() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void deleteFromEnd() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void deleteByValue(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                if (current == head) {
                    deleteFromStart();
                } else if (current == tail) {
                    deleteFromEnd();
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    size--;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Value not found");
    }

    // Traversal Operations
    public void displayFromStart() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void displayFromEnd() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    // Search Operation
    public void search(int value) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data == value) {
                System.out.println("Value found at position: " + index);
                return;
            }
            current = current.next;
            index++;
        }
        System.out.println("Value not found.");
    }

    // Reverse the List
    public void reverse() {
        Node temp = null;
        Node current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
    }

    // Count Nodes
    public int countNodes() {
        return size;
    }
    
      public static void main(String[] args) {
        LAB07_PART1_DoublyLL list = new LAB07_PART1_DoublyLL();

        // Inserting nodes
        list.addAtStart(10);
        list.displayFromStart(); // 10
        list.addAtEnd(20);
        list.displayFromStart(); // 10 20
        list.addAtPosition(15, 1);
        list.displayFromStart(); // 10 15 20

        // Deleting nodes
        list.deleteFromStart();
        list.displayFromStart(); // 15 20
        list.deleteFromEnd();
        list.displayFromStart(); // 15

        // Searching for a value
        list.search(15); // Value found at position: 0
        list.search(20); // Value not found.

        // Displaying the list from end
        list.displayFromEnd(); // 15

        // Reversing the list
        list.reverse();
        list.displayFromStart(); // 15

        // Counting nodes
        System.out.println("Total nodes: " + list.countNodes()); // Total nodes: 1
    }
    
}


  

