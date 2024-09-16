/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab03_task1_leetcode;

/**
 *
 * @author Abdul Waheed
 */
public class LAB03_TASK1_LeetCode {

   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        
        
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);
        
        
        if (lengthA > lengthB) {
            headA = advanceBy(headA, lengthA - lengthB);
        } else {
            headB = advanceBy(headB, lengthB - lengthA);
        }
        
       
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA; 
            }
            headA = headA.next;
            headB = headB.next;
        }
        
        return null; 
    }
    
    
    private int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
    
    
    private ListNode advanceBy(ListNode head, int n) {
        while (n > 0 && head != null) {
            head = head.next;
            n--;
        }
        return head;
    }
    
   
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        LAB03_TASK1_LeetCode solution = new LAB03_TASK1_LeetCode();


        ListNode intersection = new ListNode(8);
        intersection.next = new ListNode(4);
        intersection.next.next = new ListNode(5);

        
        ListNode listA = new ListNode(4);
        listA.next = new ListNode(1);
        listA.next.next = intersection;

        
        ListNode listB = new ListNode(5);
        listB.next = new ListNode(6);
        listB.next.next = new ListNode(1);
        listB.next.next.next = intersection;

        
        ListNode result = solution.getIntersectionNode(listA, listB);

        
        if (result != null) {
            System.out.println("Intersection node value: " + result.val);
        } else {
            System.out.println("No intersection");
        }
    }
}
