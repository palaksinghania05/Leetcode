/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 16-10-2022
 */

package contest;

import java.util.HashMap;

public class CountDistinctAfterReverse {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2};
        System.out.println(countDistinctIntegers(arr));
    }

    public static int countDistinctIntegers(int[] nums) {
        int[] arr = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            arr[nums.length + i] = rev(nums[i]);
        }
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int j = 0; j < arr.length; j++) {
            if (hashmap.containsKey(arr[j]))
                hashmap.put(arr[j], hashmap.get(arr[j]) + 1);
            else
                hashmap.put(arr[j], 1);
        }
        //  System.out.println(hashmap);
        return hashmap.size();
    }

    public static int rev(int n) {
        int reverse = 0;
        while (n != 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }
        return reverse;
    }
}
