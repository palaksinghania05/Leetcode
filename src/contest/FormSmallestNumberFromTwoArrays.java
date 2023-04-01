package contest;

import java.util.ArrayList;

public class FormSmallestNumberFromTwoArrays {
    public static void main(String[] args) {
        int[] num1 = {3, 5, 2, 6};
        int[] num2 = {3, 1, 7};
        System.out.println(minNumber(num1, num2));
    }

    public static int minNumber(int[] nums1, int[] nums2) {
        int val = commonVal(nums1, nums2);
        if (val == Integer.MAX_VALUE) {
            int x = Integer.MAX_VALUE;
            int y = Integer.MAX_VALUE;
            for (int i = 0; i < nums1.length; i++) {
                x = Math.min(x, nums1[i]);
            }
            for (int i = 0; i < nums2.length; i++) {
                y = Math.min(y, nums2[i]);
            }
            int result = 0;
            if (x > y)
                result = y * 10 + x;
            else
                result = x * 10 + y;
            return result;
        } else {
            return val;
        }
    }

    public static int commonVal(int[] arr1, int[] arr2) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            a.add(arr2[i]);
        }
        int ele = Integer.MAX_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if (a.contains(arr1[i]))
                ele = Math.min(ele, arr1[i]);
        }
        return ele;
    }
}
