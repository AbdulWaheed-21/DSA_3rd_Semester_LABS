/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.lab05_task1_leetcode;

/**
 *
 * @author Abdul Waheed
 */
import java.util.Stack;
public class LAB05_TASK1_LeetCode {

     public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(': 
                    stack.push(')');
                    break;
                case '{': 
                    stack.push('}');
                    break;
                case '[': 
                    stack.push(']');
                    break;
                case ')': 
                case '}': 
                case ']':
                    if (stack.isEmpty() || stack.pop() != c) {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "([{}])";
        String s3 = "(]";
        String s4 = "({[})]";

        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
        System.out.println(isValid(s4));

    }
}
