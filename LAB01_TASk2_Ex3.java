/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab01_task2_ex3;

/**
 *
 * @author Abdul Waheed
 */
public class LAB01_TASk2_Ex3 {

    public static void main(String[] args) {
      
        
        int[] originalArray = {3, 6, 9, 12, 15};
        
        
        int valueToInsertatEnd = 18;
        
        
        int[] newArray = new int[originalArray.length + 1];
        
        
        newArray[originalArray.length] = valueToInsertatEnd;
        
        
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] =originalArray [i];
        }
        
       
        System.out.println("Array after insertion:");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
        
    }
}
