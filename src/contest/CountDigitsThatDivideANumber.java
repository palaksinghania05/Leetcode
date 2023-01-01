/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 01-01-2023
 */

package contest;

public class CountDigitsThatDivideANumber {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(countDigits(num));
    }

    public static int countDigits(int num) {
        int count = 0;
        int m = num;
        while (num != 0) {
            int i = num % 10;
            if (m % i == 0)
                count++;
            num = num / 10;
        }
        return count;
    }
}
