/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 20-11-2022
 */

package contest;

import java.util.HashSet;

public class NumberOfUnequalTriplets {
    public static void main(String[] args) {
        int[] n = {4, 4, 2, 4, 3};
        System.out.println(unequalTriplets(n));
    }

    public static int unequalTriplets(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int result = 0;
        if (set.size() < 3)
            return 0;
        else {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[i] != nums[j] && nums[j] != nums[k] && nums[i] != nums[k])
                            result++;
                    }
                }
            }
            return result;
        }
    }
}
