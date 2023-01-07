/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 07-01-2023
 */

package contest;

import java.math.BigInteger;

public class CategorizeBoxAccordingToCriteria {
    public static void main(String[] args) {
        int l = 2909;
        int w = 3968;
        int h = 3272;
        int m = 727;
        System.out.println(categorizeBox(l, w, h, m));
    }

    public static String categorizeBox(int length, int width, int height, int mass) {
        boolean x = isBulky(length, width, height, mass);
        boolean y = isHeavy(mass);
        if (x && y)
            return "Both";
        else if (!x && !y)
            return "Neither";
        else if (x && !y)
            return "Bulky";
        else
            return "Heavy";
    }

    public static boolean isBulky(int l, int w, int h, int m) {
        long i = l * w;
        BigInteger j = BigInteger.valueOf(i).multiply(BigInteger.valueOf(h));
        if (l >= 10000 || w >= 10000 || h >= 10000 ||
                BigInteger.valueOf((long) Math.pow(10, 9)).compareTo(j) == -1 ||
                BigInteger.valueOf((long) Math.pow(10, 9)).compareTo(j) == 0)
            return true;
        return false;
    }

    public static boolean isHeavy(int m) {
        if (m >= 100)
            return true;
        return false;
    }
}
