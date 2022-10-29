/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 29-10-2022
 */

package contest;

import java.util.Arrays;
import java.util.HashMap;

public class OddStringDifference {
    public static void main(String[] args) {
        String[] words = {"mll", "edd", "jii", "tss", "fee", "dcc", "nmm", "abb", "utt", "zyy", "xww", "tss", "wvv", "xww", "utt"};
        System.out.println(oddString(words));
    }

    public static String oddString(String[] words) {
        HashMap<int[], String> map = new HashMap<>();
        int n = words[0].length();
        int[][] diff = new int[words.length][n - 1];
        for (int i = 0; i < diff.length; i++) {
            diff[i] = new int[n - 1];
            for (int j = 0, k = 0; j < diff[i].length && k < n - 1; j++, k++) {
                diff[i][k] = words[i].charAt(j + 1) - words[i].charAt(j);
            }
            map.put(diff[i], words[i]);
            //   System.out.println(Arrays.toString(diff[i]));
        }

        String s = "";
        for (int i = 0; i < diff.length - 2; i++) {
            for (int k = 0; k < n; k++) {
                if (Arrays.equals(diff[i], diff[i + 1]) && !Arrays.equals(diff[i + 1], diff[i + 2])) {
                    s = map.get(diff[i + 2]);
                } else if (!Arrays.equals(diff[i], diff[i + 1]) && Arrays.equals(diff[i + 1], diff[i + 2]))
                    s = map.get(diff[i]);
                else if (!Arrays.equals(diff[i], diff[i + 1]) && Arrays.equals(diff[i], diff[i + 2]))
                    s = map.get(diff[i + 1]);
            }
        }
        return s;
    }
}
