/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 03-08-2022
 */

//Problem 482
package easy;

public class LicenseKeyFormatting {
    public static void main(String[] args) {
        String s = "2-5g-3-J";
        int k = 2;
        System.out.println(licenseKeyFormatting(s, k));
    }

    public static String licenseKeyFormatting(String s, int k) {
        s = s.replaceAll("-", "");
        s = s.toUpperCase();
        System.out.println(s);
        String result = "";
        int j = s.length() % 2;
        if (j != 0)
            result += s.substring(0, j) + "-";
        for (int i = j; i < s.length(); i += k) {
            result += s.substring(i, i + k);
            result += "-";
        }
        return result.substring(0, result.length() - 1);
    }
}
