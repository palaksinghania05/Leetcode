/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 25-08-2022
 */

//Problem 724
package studyplan;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {-1, -1, 0, 1, 0, 1};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int pivot = -1;
        int leftSum = 0, rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                rightSum -= nums[i];
                if (rightSum == 0) {
                    pivot = i;
                    break;
                }
            } else if (i == nums.length - 1) {
                leftSum += nums[i - 1];
                if (leftSum == 0) {
                    pivot = i;
                    break;
                }
            } else {
                leftSum += nums[i - 1];
                rightSum -= nums[i];
                if (leftSum == rightSum) {
                    pivot = i;
                    break;
                }
            }
        }
        return pivot;
    }
}
