/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 11-09-2022
 */

package contest;

import java.util.HashMap;

public class MostFrequentEvenElement {
    public static void main(String[] args) {
        int[] arr = {29, 47, 21, 41, 13, 37, 25, 7};
        System.out.println(mostFrequentEven(arr));
    }

    public static int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && !map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else if (nums[i] % 2 == 0) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        // System.out.println(map);
        int freq = Integer.MIN_VALUE;
        int result = -1;
        for (Integer ele : map.keySet()) {
            if (map.get(ele) > freq)
                result = ele;
            else if (map.get(ele) == freq) {
                result = Math.min(ele, result);
            }
            freq = map.get(result);
            //  System.out.println(freq + " " + result);
        }
        return result;
    }
}
