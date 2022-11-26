/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 26-11-2022
 */

package contest;

public class MinimumCutsToDivideACircle {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(numberOfCuts(n));
    }

    public static int numberOfCuts(int n) {
        if (n == 1)
            return 0;
        if (n % 2 == 0)
            return n / 2;
        return n;
    }
}

