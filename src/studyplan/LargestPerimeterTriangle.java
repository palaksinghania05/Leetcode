/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 06-08-2022
 */

//Problem 976
package studyplan;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(largestPerimeter(nums));
    }

    public static int largestPerimeter(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = j + 1;
            if (nums[i] + nums[j] > nums[k] &&
                    nums[j] + nums[k] > nums[i] &&
                    nums[k] + nums[i] > nums[j]) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > result)
                    result = sum;
            }
        }
        return result;
    }
}
