/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 12-09-2022
 */

//Problem 27
package easy;

public class RemoveElement {
    public static void main(String[] args) {
        int[] num = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(num, val));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                ++k;
            }
        }
        return k;
    }
}
