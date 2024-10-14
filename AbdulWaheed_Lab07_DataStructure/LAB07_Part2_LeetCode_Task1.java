/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab07_part2_leetcode_task1;

/**
 *
 * @author Abdul Waheed
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class LAB07_Part2_LeetCode_Task1 {

 public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

       
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

       
        return slow;
    }

    public static void main(String[] args) {
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        LAB07_Part2_LeetCode_Task1 solution = new LAB07_Part2_LeetCode_Task1();
        ListNode middle = solution.middleNode(head);
        
       
        ListNode current = middle;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
       
    }
}
