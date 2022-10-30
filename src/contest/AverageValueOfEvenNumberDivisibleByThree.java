/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 30-10-2022
 */

package contest;

public class AverageValueOfEvenNumberDivisibleByThree {
    public static void main(String[] args) {
        int[] nums = {94, 65, 82, 40, 79, 74, 92, 84, 37, 19, 16, 85, 20, 79, 25, 89, 55, 67, 84, 3, 79, 38, 16, 44, 2, 54, 58, 94, 69, 71, 14, 24, 13, 21};
        System.out.println(averageValue(nums));
    }

    public static int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && nums[i] % 3 == 0) {
                sum += nums[i];
                count++;
            }
        }
        if (count == 0)
            return 0;
        return sum / count;
    }
}
