/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 28-07-2022
 */

//Problem 561
package easy;

import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        System.out.println(arrayPairSum(nums));
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0; i < nums.length; i += 2) {
            max += Math.min(nums[i], nums[i + 1]);
        }
        return max;
    }
}
