/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 10-12-2022
 */

package contest;

public class MaximumValueOfStringInArray {
    public static void main(String[] args) {
        String[] strs = {"1", "01", "001", "0001"};
        System.out.println(maximumValue(strs));
    }

    public static int maximumValue(String[] strs) {
        int max = 0;
        for (String s : strs) {
            if (allDigit(s))
                max = Math.max(max, Integer.valueOf(s));
            else
                max = Math.max(max, s.length());
        }
        return max;
    }

    public static boolean allDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)))
                return false;
        }
        return true;
    }
}
