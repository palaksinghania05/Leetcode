/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 03-08-2022
 */

//Problem 191
package studyplan;

public class NumberOf1Bits {
    public static void main(String[] args) {
        String s = "00000000000000000000000000001011";
        System.out.println(hammingWeight(s));
    }

    public static int hammingWeight(String a) {
        long n = Long.parseLong(a, 2);
        int count = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0)
                count++;
            mask <<= 1;
        }
        return count;
    }
}
