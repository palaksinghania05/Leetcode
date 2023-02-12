package contest;

import java.util.ArrayList;

public class FindTheArrayConcatenationValue {
    public static void main(String[] args) {
        int[] arr = {5, 14, 13, 8, 12};
        System.out.println(findTheArrayConcVal(arr));
    }

    public static long findTheArrayConcVal(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            a.add(nums[i]);
        }
        long result = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (i == j) {
                result += Long.parseLong(String.valueOf(a.get(i)));
                break;
            }
            int num1 = a.get(i);
            int num2 = a.get(j);
            String concatVal = String.valueOf(num1) + String.valueOf(num2);
            result += Long.parseLong(concatVal);
            i++;
            j--;
        }
        return result;
    }
}
