/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab06_task03;


/**
 *
 * @author Abdul Waheed
 */
import java.util.Arrays;

public class LAB06_TASK03 {

  public static void main(String[] args) {
        String[] words = {"apple", "pie", "banana", "cat"};
        
        bubbleSortByLength(words);
        
        System.out.println(Arrays.toString(words));
    }

    public static void bubbleSortByLength(String[] arr) {
        int n = arr.length;
        boolean swapped;

 
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j].length() > arr[j + 1].length()) {

                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            if (!swapped) {
                break;
            }
        }
    }
}