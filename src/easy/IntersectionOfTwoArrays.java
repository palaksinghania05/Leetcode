/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 29-07-2022
 */

//Problem 349
package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> helper = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            helper.add(nums2[i]);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (helper.contains(nums1[i]) && !result.contains(nums1[i])) {
                result.add(nums1[i]);
                helper.remove(Integer.valueOf(nums1[i]));
            }
        }
        int[] output = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }
        return output;
    }
}
