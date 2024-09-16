/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab03_task4_leetcode;

/**
 *
 * @author Abdul Waheed
 */
public class LAB03_TASK4_LeetCode {

      public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        
        while (l1 != null || l2 != null || carry != 0) {
         
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            
            
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            
            
            current.next = new ListNode(sum);
            current = current.next;

           
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        
        return dummy.next;
    }

    
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        LAB03_TASK4_LeetCode solution = new LAB03_TASK4_LeetCode();

       
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        
        ListNode result = solution.addTwoNumbers(l1, l2);

       
        ListNode current = result;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
