/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab03_task3_leetcode;

/**
 *
 * @author Abdul Waheed
 */
public class LAB03_TASK3_LeetCode {

     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        //
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        
      
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
        
        
        return dummy.next;
    }

    
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
       LAB03_TASK3_LeetCode  solution = new LAB03_TASK3_LeetCode();

   
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

       
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

      
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

       
        ListNode current = mergedList;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
