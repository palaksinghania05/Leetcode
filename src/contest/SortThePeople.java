/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 25-09-2022
 */

package contest;

import java.util.Arrays;
import java.util.HashMap;

public class SortThePeople {
    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] result = new String[names.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            result[names.length - i - 1] = map.get(heights[i]);
        }
        return result;
    }
}
