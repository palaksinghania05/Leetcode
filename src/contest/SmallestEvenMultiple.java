/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 18-09-2022
 */

package contest;

public class SmallestEvenMultiple {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(smallestEvenMultiple(n));
    }

    public static int smallestEvenMultiple(int n) {
        int i = 1;
        while (true) {
            if ((n * i) % 2 == 0)
                break;
            else
                i++;
        }
        return n * i;
    }
}
