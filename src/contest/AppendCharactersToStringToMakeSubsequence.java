/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 27-11-2022
 */

package contest;

public class AppendCharactersToStringToMakeSubsequence {
    public static void main(String[] args) {
        String s = "coaching";
        String t = "coding";
        System.out.println(appendCharacters(s, t));
    }

    public static int appendCharacters(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j))
                j++;
            i++;
        }
        return t.length() - j;
    }
}
