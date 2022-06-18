/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-05-2022
 */

package contest;

public class LargestCombination {
    public static void main(String[] args) {
        int result = largestCombination(new int[]{16, 17, 71, 62, 12, 24, 14});
        System.out.println(result);
    }

    public static int largestCombination(int[] candidates) {
        int n = candidates.length;
        int[] arr = new int[32];
        for (int i = 0; i < n; i++) {
            int bit = 31;
            while (candidates[i] != 0) {
                if ((candidates[i] & 1) == 1)
                    arr[bit]++;
                candidates[i] = candidates[i] >> 1;
                bit--;
            }
        }
        int maxValue = Integer.MIN_VALUE;
        for (int idx = 0; idx < 32; idx++) {
            maxValue = Math.max(maxValue, arr[idx]);
        }
        return maxValue;
    }
}
