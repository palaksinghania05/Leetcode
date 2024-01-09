package contest;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateDigitsInAnArray {
    public static void main(String[] args) {
        int[] nums = {7, 1, 3, 9};
        System.out.println(Arrays.toString(separateDigits(nums)));
    }

    public static int[] separateDigits(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            String n = Integer.toString(nums[i]);
            for (int j = 0; j < n.length(); j++) {
                a.add(Integer.parseInt(String.valueOf(n.charAt(j))));
            }
        }
        int[] answer = new int[a.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = a.get(i);
        }
        return answer;
    }
}
