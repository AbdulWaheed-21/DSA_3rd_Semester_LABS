/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab03_task2_leetcode;

/**
 *
 * @author Abdul Waheed
 */
public class LAB03_TASK2_LeetCode {

    public ListNode deleteDuplicates(ListNode head) {
        
        if (head == null || head.next == null) {
            return head;
        }

        
        ListNode current = head;

       
        while (current != null && current.next != null) {
           
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
               
                current = current.next;
            }
        }

        return head;
    }

 
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
       LAB03_TASK2_LeetCode solution = new LAB03_TASK2_LeetCode();

       
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        
        ListNode result = solution.deleteDuplicates(head);

     
        ListNode current = result;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
