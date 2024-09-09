/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab02_task3_leetcode;

/**
 *
 * @author Abdul Waheed
 */
public class LAB02_TASK3_LeetCode {

    public static void main(String[] args) {
        String[] sentences = {
            "This is a sentence",
            "Another example sentence with more words",
            "Short",
            "A very very long sentence that is supposed to test the maximum number of words"
        };
        
        System.out.println(maxWords(sentences)); 
    }
    
    public static int maxWords(String[] sentences) {
        int maxWords = 0;
        
        for (String sentence : sentences) {
       
            String[] words = sentence.split(" ");
            
            
            if (words.length > maxWords) {
                maxWords = words.length;
            }
        }
        
        return maxWords;
        
    }
}
