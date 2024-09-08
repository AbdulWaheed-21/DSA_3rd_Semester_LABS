/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab01_task5_reversearray;

/**
 *
 * @author Abdul Waheed
 */

public class LAB01_TASK5_ReverseArray {


    public static int[] reverseArray(int[] inputArray) {
        
        int[] reversedArray = new int[inputArray.length];
        
      
        for (int i = 0; i < inputArray.length; i++) {
            reversedArray[i] = inputArray[inputArray.length - 1 - i];
        }
        
        return reversedArray;
    }
    
    public static void main(String[] args) {
        
        int[] inputArray = {1, 3, 5, 7, 9};
        
        
        int[] reversedArray = reverseArray(inputArray);
        
        
        System.out.print("Reversed array: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
     
    }
}
