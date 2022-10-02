/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 02-10-2022
 */

package contest;

public class NumberOfCommonFactors {
    public static void main(String[] args) {
        int a = 12;
        int b = 6;
        System.out.println(commonFactors(a, b));
    }

    public static int commonFactors(int a, int b) {
        int range = Math.min(a, b);
        int count = 0;
        for (int i = 1; i <= range; i++) {
            if (a % i == 0 && b % i == 0)
                count++;
        }
        return count;
    }
}
