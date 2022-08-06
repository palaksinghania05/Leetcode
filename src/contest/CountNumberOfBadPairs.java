/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 06-08-2022
 */

package contest;

public class CountNumberOfBadPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(countBadPairs(nums));
    }

    public static long countBadPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i < j && j - i != nums[j] - nums[i])
                    count++;
            }
        }
        return count;
    }
}
