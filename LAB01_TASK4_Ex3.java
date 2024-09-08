/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab01_task4_ex3;

/**
 *
 * @author Abdul Waheed
 */
public class LAB01_TASK4_Ex3 {

    public static void main (String[] args){
    
        int[] array = {11, 22, 33, 44, 55};
        int target = 33;
        int result = binarySearch(array, target);
        
        if (result == -1) {
            System.out.println("Value " + target + " not found in the array.");
        } else {
            System.out.println("Element " + target + " found at index " + result + ".");
        }
    }
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
   
        return -1;  
}}
