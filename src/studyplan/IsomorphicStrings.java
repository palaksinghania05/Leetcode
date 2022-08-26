/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 26-08-2022
 */

package studyplan;

import java.util.ArrayList;
import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        ArrayList<Character> used = new ArrayList<>();
        int i;
        if (s.length() != t.length())
            return false;
        else {
            for (i = 0; i < s.length(); i++) {
                if (!map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), t.charAt(i));
                    if (used.contains(t.charAt(i)))
                        break;
                    else
                        used.add(t.charAt(i));
                } else {
                    if (t.charAt(i) == map.get(s.charAt(i)))
                        continue;
                    else
                        break;
                }
            }
        }
        if (i == s.length())
            return true;
        else
            return false;
    }
}
