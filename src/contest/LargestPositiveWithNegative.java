/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 16-10-2022
 */

package contest;

import java.util.ArrayList;

public class LargestPositiveWithNegative {
    public static void main(String[] args) {
        int[] arr = {-10, 8, 6, 7, -2, -3};
        System.out.println(findMaxK(arr));
    }

    public static int findMaxK(int[] nums) {
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0)
                negatives.add(nums[i]);
            else
                positives.add(nums[i]);
        }
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < negatives.size(); i++) {
            if (max > negatives.get(i) && positives.contains(Math.abs(negatives.get(i))))
                max = negatives.get(i);
        }
        if (max == Integer.MAX_VALUE)
            return -1;
        else
            return Math.abs(max);
    }
}
