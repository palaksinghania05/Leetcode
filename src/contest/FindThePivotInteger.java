/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 27-11-2022
 */

package contest;

public class FindThePivotInteger {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(pivotInteger(n));
    }

    public static int pivotInteger(int n) {
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum = sum + j;
            }
            if ((i * (i + 1)) / 2 == sum)
                return i;
        }
        return -1;
    }
}
