/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab02_task1_leetcode;

/**
 *
 * @author Abdul Waheed
 */
public class LAB02_TASK1_LeetCode {

       
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

      
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
        }

        
        for (int i = 0; i < n; i++) {
            ans[i + n] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        // Example usage
        LAB02_TASK1_LeetCode ArrayResult = new LAB02_TASK1_LeetCode();

       
        int[] nums = {1, 2, 3, 4};

        
        int[] result = ArrayResult.getConcatenation(nums);

        
        System.out.print("Concatenated array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
