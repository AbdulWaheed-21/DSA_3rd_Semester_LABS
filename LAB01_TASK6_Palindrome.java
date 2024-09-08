/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab01_task6_palindrome;

/**
 *
 * @author Abdul Waheed
 */
public class LAB01_TASK6_Palindrome {

    public static boolean isPalindrome(String str) {
        
        char[] charArray = str.toCharArray();
        
        int left = 0;
        int right = charArray.length - 1;
    
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }
    public static void main(String[] args) {
       
        String[] testStrings = {"radar", "hello", "level", "world", "madam"};
        
        for (String str : testStrings) {
            if (isPalindrome(str)) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
            }
        }

    }
}
