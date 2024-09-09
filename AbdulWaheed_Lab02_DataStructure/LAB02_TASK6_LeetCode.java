/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab02_task6_leetcode;

/**
 *
 * @author Abdul Waheed
 */
public class LAB02_TASK6_LeetCode {

       public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n)); 
    }

    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0; 
        }

        boolean[] isPrime = new boolean[n];
        
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

       
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    
    
    }
}
