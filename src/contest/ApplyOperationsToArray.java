/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 06-11-2022
 */

package contest;

import java.util.Arrays;

public class ApplyOperationsToArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 0};
        System.out.println(Arrays.toString(applyOperations(arr)));
    }

    public static int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        pushToEnd(nums);
        return nums;
    }

    public static void pushToEnd(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] != 0)
                a[count++] = a[i];
        while (count < a.length)
            a[count++] = 0;
    }
}
