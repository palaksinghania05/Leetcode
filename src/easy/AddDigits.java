/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 19-07-2022
 */

package easy;

public class AddDigits {
    public static void main(String[] args) {
        int n = 38;
        System.out.println(addDigits(n));
    }

    public static int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num != 0) {
                int rem = num % 10;
                sum += rem;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
