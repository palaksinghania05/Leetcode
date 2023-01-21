/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 21-01-2023
 */

package contest;

public class MinimumCommonValue {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {2, 4};
        System.out.println(getCommon(a, b));
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int result = -1;
        for (int k = 0; k < nums1.length; ) {
            if (nums1[k] == nums2[i]) {
                result = nums1[k];
                break;
            }
            if (i < nums2.length - 1 && nums2[i] < nums1[k])
                i++;
            else
                k++;
        }
        return result;
        /*ArrayList<Integer> a = new ArrayList<>();
        if (nums1.length <= nums2.length) {
            for (int i = 0; i < nums2.length; i++) {
                a.add(nums2[i]);
            }
            int result = -1;
            for (int i = 0; i < nums1.length; i++) {
                if (a.contains(nums1[i])) {
                    result = nums1[i];
                    break;
                }
            }
            if (result == -1)
                return -1;
            else
                return result;
        } else {
            for (int i = 0; i < nums1.length; i++) {
                a.add(nums1[i]);
            }
            int result = -1;
            for (int i = 0; i < nums2.length; i++) {
                if (a.contains(nums2[i])) {
                    result = nums2[i];
                    break;
                }
            }
            if (result == -1)
                return -1;
            else
                return result;
        }*/
    }
}
