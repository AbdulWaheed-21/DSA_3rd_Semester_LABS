/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab01_task3;

/**
 *
 * @author Abdul Waheed
 */
public class LAB01_TASK3 {

    public static void main(String[] args) {
        
        
         
        // Initialize the array
        int[] array = {8, 16, 24, 32, 40};
        
        // Index of the element to "delete"
        int indexToDelete = 2;
        
        // Check if the index is within bounds
        if (indexToDelete < 0 || indexToDelete >= array.length) {
            System.out.println("Index out of bounds");
            return;
        }
        
        // Set the element at the index to 0
        array[indexToDelete] = 0;
        
        // Print the array with the modified element
        System.out.println("Array after setting the element to 0:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        
    }
}
