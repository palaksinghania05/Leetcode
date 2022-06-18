/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-05-2022
 */

package contest;

import java.util.Arrays;

public class MaximumConsecutiveFloors {
    public static void main(String[] args) {
        int result = maxConsecutive(2, 9, new int[]{4, 6});
        System.out.println(result);
    }

    public static int maxConsecutive(int bottom, int top, int[] special) {
        // to avoid anomaly
        Arrays.sort(special);
        int n = special.length;
        //from bottom
        int output = special[0] - bottom;
        //inside loop
        for (int floor = 1; floor < n; floor++) {
            output = Math.max(output, special[floor] - special[floor - 1] - 1);
        }
        //from top
        output = Math.max(output, top - special[n - 1]);
        return output;
    }
}
