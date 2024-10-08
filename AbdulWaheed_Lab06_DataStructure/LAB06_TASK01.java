/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab06_task01;

/**
 *
 * @author Abdul Waheed
 */
public class LAB06_TASK01 {

    
    public static void BubbleSort(int[] arr){
    
    
    for (int i = 0; i< arr.length-1; i++){
        for(int j = 0; j< arr.length-i-1; j++ ){          
            if(arr[j] > arr [j+1]){
                int temp = arr [j];
                arr[j] = arr[j+1];
                arr[j+1] = temp; 
            }
        }
    }
    for(int i=0; i<=arr.length-1;i++)
        System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
       
        int[] arr ={5,1,3,4,6,2}; 
 
        BubbleSort(arr);    

    }
    }

