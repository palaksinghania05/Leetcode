/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-07-2022
 */

//Problem 202
package easy;

import java.util.ArrayList;

public class HappyNumber {
    public static void main(String[] args) {
        int num1 = 321;
        int num2 = 2;
        System.out.println(isHappy(num1));
        System.out.println(isHappy(num2));
    }

    public static boolean isHappy(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(n);
        int m = 0;
        do {
            m = sum(n);
            if (arr.contains(m))
                break;
            else {
                n = m;
                arr.add(m);
            }
        } while (n != 1);
        if (n == 1)
            return true;
        else
            return false;
    }

    public static int sum(int n) {
        int s = 0;
        while (n > 0) {
            int rem = n % 10;
            s = (int) (s + Math.pow(rem, 2));
            n /= 10;
        }
        return s;
    }
}
