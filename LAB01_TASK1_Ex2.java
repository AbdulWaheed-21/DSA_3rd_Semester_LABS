/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab01_task1_ex2;

/**
 *
 * @author Abdul Waheed
 */
public class LAB01_TASK1_Ex2 {

    public static void main(String[] args) {
        
       
         System.out.println("Array Elements Simply prints: ");
        int[] nums= new int[6];
        
        nums[0] = 5; 
        nums[1] = 15;
        nums[2] = 25;
        nums[3] = 35;
        nums[4] = 45;
        nums[5] = 55;
        for ( int i = 0; i<=nums.length ; i++){
       
            
             System.out.println("Element at index " + i + " : "+nums[i]);
        }
        
        
    }
}
