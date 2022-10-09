/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 09-10-2022
 */

package contest;

import java.util.Arrays;

public class OriginalArrayOfPrefixXOR {
    public static void main(String[] args) {
        int[] pref = {5, 2, 0, 3, 1};
        System.out.println(Arrays.toString(findArray(pref)));
    }

    public static int[] findArray(int[] pref) {
        int[] result = new int[pref.length];
        result[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {
            result[i] = pref[i] ^ pref[i - 1];
        }
        return result;
    }
}
