package contest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MergeTwo2DArraysBySummingValues {
    public static void main(String[] args) {
        int[][] a1 = {{1, 2}, {2, 3}, {4, 5}};
        int[][] a2 = {{1, 4}, {3, 2}, {4, 1}};
        System.out.println(Arrays.deepToString(mergeArrays(a1, a2)));
    }

    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i][0]))
                map.put(nums1[i][0], map.get(nums1[i][0]) + nums1[i][1]);
            else
                map.put(nums1[i][0], nums1[i][1]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i][0]))
                map.put(nums2[i][0], map.get(nums2[i][0]) + nums2[i][1]);
            else
                map.put(nums2[i][0], nums2[i][1]);
        }
        //  System.out.println(map);
        int[][] result = new int[map.size()][2];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result[i][0] = entry.getKey();
            result[i][1] = entry.getValue();
            i++;
        }
        Arrays.sort(result, Comparator.comparingInt(a -> a[0]));
        return result;
    }
}
