/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab01_task7_anagram;

/**
 *
 * @author Abdul Waheed
 */
import java.util.Arrays;
public class LAB01_TASK7_Anagram {

    
    public static boolean areAnagrams(String str1, String str2) {
        // If the lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert the strings to character arrays
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compare the sorted arrays
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        // Example inputs
        String str1 = "listen";
        String str2 = "silent";
        
        if (areAnagrams(str1, str2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        // Another example input
        str1 = "hello";
        str2 = "world";

        if (areAnagrams(str1, str2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
