/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 04-09-2022
 */

package contest;

import java.util.ArrayList;

public class CheckDistanceBetweenSameLetters {
    public static void main(String[] args) {
        String s = "abaccb";
        int[] distance = {1, 2, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(checkDistances(s, distance));
    }

    public static boolean checkDistances(String s, int[] distance) {
        ArrayList<Character> occurrence = new ArrayList<>();
        int f = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!occurrence.contains(s.charAt(i))) {
                occurrence.add(s.charAt(i));
                int j = 0;
                for (j = 0; j < s.length(); j++) {
                    if (i != j && s.charAt(i) == s.charAt(j)) {
                        if (distance[s.charAt(i) - 97] != j - i - 1) {
                            f = 0;
                            break;
                        } else
                            f = 1;
                    }
                }
                if (j != s.length())
                    break;
            }
        }
        if (f == 1)
            return true;
        else
            return false;
    }
}
