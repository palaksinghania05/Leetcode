package contest;

import java.util.Arrays;

public class LeftAndRightSumDifferences {
    public static void main(String[] args) {
        int[] num = {1};
        System.out.println(Arrays.toString(leftRigthDifference(num)));
    }

    public static int[] leftRigthDifference(int[] nums) {
        int[] result = new int[nums.length];
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            rightSum = rightSum + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            result[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }
        return result;
    }
}
