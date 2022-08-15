/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-08-2022
 */

package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] words = {"adsdf", "sfd"};
        System.out.println(Arrays.toString(findWords(words)));
    }

    public static String[] findWords(String[] words) {
        ArrayList<String> w = new ArrayList<>();
        Collections.addAll(w, words);
        System.out.println(w);
        for (String word : words) {
            if (!firstLine(word.toLowerCase()) && !secondLine(word.toLowerCase()) && !thirdLine(word.toLowerCase()))
                w.remove(word);
        }
        String[] output = new String[w.size()];
        for (int i = 0; i < w.size(); i++) {
            output[i] = w.get(i);
        }
        return output;
    }

    public static boolean firstLine(String s) {
        String str = "qwertyuiop";
        for (int i = 0; i < s.length(); i++) {
            if (str.indexOf(s.charAt(i)) == -1)
                return false;
        }
        return true;
    }

    public static boolean secondLine(String s) {
        String str = "asdfghjkl";
        for (int i = 0; i < s.length(); i++) {
            if (str.indexOf(s.charAt(i)) == -1)
                return false;
        }
        return true;
    }

    public static boolean thirdLine(String s) {
        String str = "zxcvbnm";
        for (int i = 0; i < s.length(); i++) {
            if (str.indexOf(s.charAt(i)) == -1)
                return false;
        }
        return true;
    }
}
