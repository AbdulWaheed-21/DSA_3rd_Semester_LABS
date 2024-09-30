/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab05_task3_leetcode;

/**
 *
 * @author Abdul Waheed
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
public class LAB05_TASK3_LeetCode {
public int[] nextGreaterElement(int[] nums1, int[] nums2) {
                Map<Integer, Integer> nextGreaterMap = new HashMap<>();
     
        Stack<Integer> stack = new Stack<>();

        
        for (int num : nums2) {
           
            while (!stack.isEmpty() && num > stack.peek()) {
                
                nextGreaterMap.put(stack.pop(), num);
            }
           
            stack.push(num);
        }

       
        while (!stack.isEmpty()) {
            nextGreaterMap.put(stack.pop(), -1);
        }

       
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.get(nums1[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        LAB05_TASK3_LeetCode solution = new LAB05_TASK3_LeetCode();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] output = solution.nextGreaterElement(nums1, nums2);
        
      
        for (int val : output) {
            System.out.print(val + " ");
        }
       

    }
}
