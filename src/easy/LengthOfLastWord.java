/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-07-2022
 */

//Problem 58
package easy;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s1 = "   fly me   to   the moon  ";
        String s2 = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s1));
        System.out.println(lengthOfLastWord(s2));
    }

    public static int lengthOfLastWord(String s) {
        int count = 0;
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            if (String.valueOf(s.charAt(i)).equals(" ") && count == 0)
                continue;
            if (String.valueOf(s.charAt(i)).equals(" "))
                return count;
            else
                count++;
        }
        return count;
    }
}
