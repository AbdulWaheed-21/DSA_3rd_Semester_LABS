/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab01_task4;

/**
 *
 * @author Abdul Waheed
 */
public class LAB01_TASK4 {

    public static void main(String[] args) {
        
         
       int[] Arr = {13, 26, 39, 52, 65};
       
       int indextosearch= 4;
       
       
       for (int i = 0; i<Arr.length; i++){
       
           
           
       if ( Arr[indextosearch] ==   Arr[i]) {
       
           System.out.println("Element at index " + Arr[indextosearch] + " : " + Arr[indextosearch]);
       
       }
       
       }            
                
    }
}
