/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab05_task4_leetcode;

/**
 *
 * @author Abdul Waheed
 */
import java.util.Stack;
public class LAB05_TASK4_LeetCode {

   public static int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        System.arraycopy(prices, 0, answer, 0, n);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
       
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int idx = stack.pop();
                answer[idx] -= prices[i];
            }
            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] prices = {8, 4, 6, 2, 3};
        int[] output = finalPrices(prices);
        for (int price : output) {
            System.out.print(price + " ");
        }
    }
}
