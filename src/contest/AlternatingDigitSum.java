/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 22-01-2023
 */

package contest;

public class AlternatingDigitSum {
    public static void main(String[] args) {
        int n = 886996;
        System.out.println(alternateDigitSum(n));
    }

    public static int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0)
                sum = sum + Integer.parseInt(String.valueOf(s.charAt(i)));
            else
                sum = sum - Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return sum;
    }
}
