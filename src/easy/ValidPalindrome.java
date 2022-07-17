/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 10-07-2022
 */

//Problem 125
package easy;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 0)
            return true;
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
//        for (int i = 0; i < s.length(); i++) {
//            if(!Character.isDigit(s.charAt(i)) || !Character.isLetter(s.charAt(i)))
//                s = s.replace(String.valueOf(s.charAt(i)),"");
//        }
//        System.out.println(s);
        for (int i = 0, j = s.length() - 1; i < s.length() && j >= 0; i++, j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
}
