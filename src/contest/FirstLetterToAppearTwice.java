/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 24-07-2022
 */

package contest;

import java.util.HashMap;

public class FirstLetterToAppearTwice {
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }

    public static char repeatedCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char result = 'a';
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!map.containsKey(ch))
                map.put(ch, 1);
            else {
                result = ch;
                break;
            }
        }
        return result;
    }
}
