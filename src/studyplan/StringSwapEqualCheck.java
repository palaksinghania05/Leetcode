/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 11-08-2022
 */

//Problem 1790
package studyplan;

import java.util.ArrayList;
import java.util.List;

public class StringSwapEqualCheck {
    public static void main(String[] args) {
        String s1 = "bank";
        String s2 = "kanb";
        System.out.println(areAlmostEqual(s1, s2));
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        if (s1.equals(s2))
            return true;
        else {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < s1.length(); i++)
                if (s1.charAt(i) != s2.charAt(i)) list.add(i);
            return list.size() == 2 &&
                    s1.charAt(list.get(0)) == s2.charAt(list.get(1)) &&
                    s2.charAt(list.get(0)) == s1.charAt(list.get(1));
        }
    }
}
