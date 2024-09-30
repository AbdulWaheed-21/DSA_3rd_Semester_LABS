/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab05_task2_leetcode;

/**
 *
 * @author Abdul Waheed
 */

   class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class LAB05_TASK2_LeetCode {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode current = slow;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        
        ListNode firstHalf = head;
        ListNode secondHalf = prev; 
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public static void main(String[] args) {
       
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        LAB05_TASK2_LeetCode solution = new LAB05_TASK2_LeetCode();
        System.out.println(solution.isPalindrome(head));
        
        
    }
}
