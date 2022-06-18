/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-05-2022
 */

package contest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class RemoveAnagrams {
    public static void main(String[] args) {
        List<String> result = removeAnagrams(new String[]{"a", "b", "c", "d", "e"});
        System.out.println(result);
    }

    public static List<String> removeAnagrams(String[] words) {
        List<String> output = new ArrayList<>();
        //  System.out.println(input);
        output.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (!isAnagram(words[i - 1], words[i]))
                output.add(words[i]);
        }
        return output;
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (map.containsKey(s1.charAt(i))) {
                map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
            } else {
                map.put(s1.charAt(i), 1);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if (map.containsKey(s2.charAt(i))) {
                map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
            }
        }
        Set<Character> keys = map.keySet();
        for (Character key : keys) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        return true;
    }
}
