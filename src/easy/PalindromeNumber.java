/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 24-03-2022
 */

//Problem 9
package easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        int N = 123;
        boolean result = isPalindrome(N);
        System.out.println(result);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int y = x;
        int rev = 0;
        while (y != 0) {
            int rem = y % 10;
            rev = rev * 10 + rem;
            y = y / 10;
        }
        if (x == rev)
            return true;

        return false;
    }
}
