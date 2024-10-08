/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab06_task3_leetcode;

/**
 *
 * @author Abdul Waheed
 */
public class LAB06_TASK3_LeetCode {

   public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        char result = findTheDifference(s, t);
        System.out.println(result); // Output: e
    }

    public static char findTheDifference(String s, String t) {
        int[] count = new int[26]; 

       
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

       
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) {
                return c;
            }
        }

        return ' ';
    }
}