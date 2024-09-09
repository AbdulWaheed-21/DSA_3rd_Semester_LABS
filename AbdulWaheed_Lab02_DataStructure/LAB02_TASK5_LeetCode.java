/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab02_task5_leetcode;

/**
 *
 * @author Abdul Waheed
 */
import java.util.HashSet;
import java.util.Set;
public class LAB02_TASK5_LeetCode {

       public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 3, 1};
        int[] nums2 = {2, 2, 5, 2, 3, 6};
        
        int[] result = calculateCounts(nums1, nums2);
        System.out.println("Answer1: " + result[0]); 
        System.out.println("Answer2: " + result[1]); 
    }
    
    public static int[] calculateCounts(int[] nums1, int[] nums2) {
        
        Set<Integer> setNums1 = new HashSet<>();
        Set<Integer> setNums2 = new HashSet<>();
        
        for (int num : nums1) {
            setNums1.add(num);
        }
        
        for (int num : nums2) {
            setNums2.add(num);
        }
        
        
        int answer1 = 0;
        for (int num : nums1) {
            if (setNums2.contains(num)) {
                answer1++;
            }
        }
        
        
        int answer2 = 0;
        for (int num : nums2) {
            if (setNums1.contains(num)) {
                answer2++;
            }
        }
        
        return new int[]{answer1, answer2};  
        
    }
}
