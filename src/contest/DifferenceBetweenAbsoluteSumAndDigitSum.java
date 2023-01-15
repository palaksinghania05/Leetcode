/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-01-2023
 */

package contest;

public class DifferenceBetweenAbsoluteSumAndDigitSum {
    public static void main(String[] args) {
        int[] nums = {1, 15, 6, 3};
        System.out.println(differenceOfSum(nums));
    }

    public static int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for (int i = 0; i < nums.length; i++) {
            elementSum += nums[i];
            int count = (int) Math.floor(Math.log10(nums[i]) + 1);
            if (count > 1)
                digitSum += sum(nums[i]);
            else
                digitSum += nums[i];
        }
        return Math.abs(elementSum - digitSum);
    }

    public static int sum(int n) {
        int s = 0;
        while (n != 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
}
