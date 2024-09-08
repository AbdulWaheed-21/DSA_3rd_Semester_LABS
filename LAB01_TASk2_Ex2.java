/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab01_task2_ex2;

/**
 *
 * @author Abdul Waheed
 */
public class LAB01_TASk2_Ex2 {

    public static void main(String[] args) {
        
        int[] insertAtMiddle= {100, 200, 300, 400, 500}; 
        
        int insertvalue=250;
        
        int insertatindex=2;
        int [] newarr = new int[insertAtMiddle.length+1];
        
        
        for(int i = 0; i<insertatindex; i++){
            
            newarr[i] = insertAtMiddle[i];
        
        }
        newarr[insertatindex]=insertvalue;
        
        for(int i = insertatindex; i<insertAtMiddle.length; i++){
            
            newarr[i+1] = insertAtMiddle[i];
        }
        System.out.println("Array after isertion at middle: ");
        
        for(int num : newarr){
        
            System.out.print(num +" ");
        }
    }
}
