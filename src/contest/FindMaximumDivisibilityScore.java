package contest;

public class FindMaximumDivisibilityScore {
    public static void main(String[] args) {
        int[] nums = {4, 7, 9, 3, 9};
        int[] divisors = {5, 2, 3};
        System.out.println(maxDivScore(nums, divisors));
    }

    public static int maxDivScore(int[] nums, int[] divisors) {
        int score = Integer.MIN_VALUE;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < divisors.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % divisors[i] == 0)
                    count++;
            }
            if (count > score) {
                score = count;
                result = divisors[i];
            } else if (count == score) {
                result = Math.min(result, divisors[i]);
            }
        }
        return result;
    }
}
