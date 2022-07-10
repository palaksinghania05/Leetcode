/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 10-07-2022
 */

//Problem 20
package easy;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = "(]{}";
        System.out.println(isValid(pattern));
    }

    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(')
                stack.push(ch);
            else {
                if (stack.isEmpty())
                    return false;
                else {
                    if (stack.peek() == '(' && ch == ')')
                        stack.pop();
                    else if (stack.peek() == '[' && ch == ']')
                        stack.pop();
                    else if (stack.peek() == '{' && ch == '}')
                        stack.pop();
                    else
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
