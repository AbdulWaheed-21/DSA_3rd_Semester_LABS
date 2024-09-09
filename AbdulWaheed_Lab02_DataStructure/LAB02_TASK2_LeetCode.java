/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab02_task2_leetcode;

/**
 *
 * @author Abdul Waheed
 */
import java.util.ArrayList;
import java.util.List;
public class LAB02_TASK2_LeetCode {

    
    public int[] indicesContainingChar(String[] words, char x) {
        List<Integer> indices = new ArrayList<>();
        
        
        for (int i = 0; i < words.length; i++) {
            
            if (words[i].indexOf(x) >= 0) {
                
                indices.add(i);
            }
        }
        
    
        int[] result = new int[indices.size()];
        for (int i = 0; i < indices.size(); i++) {
            result[i] = indices.get(i);
        }
        
        return result;
    }

    public static void main(String[] args) {
       
        LAB02_TASK2_LeetCode solution = new LAB02_TASK2_LeetCode();

        
        String[] words = {"apple", "banana", "cherry", "date"};
        char x = 'a';

        
        int[] result = solution.indicesContainingChar(words, x);

        
        System.out.print("Indices of words containing '" + x + "': ");
        for (int index : result) {
            System.out.print(index + " ");
        }
        
    }
}
