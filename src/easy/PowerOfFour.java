/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 22-08-2022
 */

//Problem 342
package easy;

public class PowerOfFour {
    public static void main(String[] args) {
        int n1 = 16;
        int n2 = -2147483648;
        int n3 = 1;
        System.out.println(isPowerOfFour(n1));
        System.out.println(isPowerOfFour(n2));
        System.out.println(isPowerOfFour(n3));
    }

    public static boolean isPowerOfFour(int n) {
        if (n == 0)
            return false;
        while (n != 1) {
            if (n % 4 != 0)
                return false;
            n = n / 4;
        }
        return true;
    }
}
