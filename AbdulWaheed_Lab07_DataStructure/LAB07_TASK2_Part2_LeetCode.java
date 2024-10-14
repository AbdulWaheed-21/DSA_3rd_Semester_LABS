/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab07_task2_part2_leetcode;

/**
 *
 * @author Abdul Waheed
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class LAB07_TASK2_Part2_LeetCode {
public int getDecimalValue(ListNode head) {
        int decimalValue = 0;

        while (head != null) {
           
            decimalValue = (decimalValue << 1) | head.val;
            head = head.next; 
        }

        return decimalValue;
    }

    public static void main(String[] args) {
     
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);

       LAB07_TASK2_Part2_LeetCode solution = new LAB07_TASK2_Part2_LeetCode();
        int result = solution.getDecimalValue(head);
        System.out.println(result); 
    }
}
