/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 31-07-2022
 */

package contest;


public class MakeArrayZeroBySubtractingEqqualAmounts {
    public static void main(String[] args) {
        int[] nums = {1, 5, 0, 3, 5};
        System.out.println(minimumOperations(nums));
    }

    public static int minimumOperations(int[] nums) {
        int count = 0;
        int min = smallest(nums);
        while (min > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0)
                    nums[i] = nums[i] - min;
            }
            //   System.out.println(Arrays.toString(nums));
            count++;
            min = smallest(nums);
        }
        return count;
    }

    public static int smallest(int[] nums) {
        int min = -1;
        for (int i = 0; i < nums.length; i++) {
            if (min == -1 && nums[i] != 0)
                min = nums[i];
            else if (nums[i] != 0 && nums[i] < min)
                min = nums[i];
        }
        return min;
    }
}
