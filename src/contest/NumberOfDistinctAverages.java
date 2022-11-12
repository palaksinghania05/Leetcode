/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 12-11-2022
 */

package contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class NumberOfDistinctAverages {
    public static void main(String[] args) {
        int[] num = {1, 100};
        System.out.println(distinctAverages(num));
    }

    public static int distinctAverages(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            a.add(nums[i]);
        }
        HashSet<Double> set = new HashSet<>();
        while (a.size() != 0) {
            int n = a.size();
            Collections.sort(a);
            set.add((double) (a.get(0) + a.get(n - 1)) / 2);
            a.remove(Integer.valueOf(a.get(0)));
            a.remove(Integer.valueOf(a.get(n - 2)));
        }
        return set.size();
    }
}
