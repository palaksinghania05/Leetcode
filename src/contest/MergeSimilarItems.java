/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 06-08-2022
 */

package contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MergeSimilarItems {
    public static void main(String[] args) {
        int[][] items1 = {{1, 1}, {3, 2}, {2, 3}};
        int[][] items2 = {{2, 1}, {3, 2}, {1, 3}};
        System.out.println(mergeSimilarItems(items1, items2));
    }

    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < items1.length; i++) {
            int a = items1[i][0];
            if (map.containsKey(a))
                map.put(a, map.get(a) + items1[i][1]);
            else
                map.put(a, items1[i][1]);
        }
        for (int i = 0; i < items2.length; i++) {
            int a = items2[i][0];
            if (map.containsKey(a))
                map.put(a, map.get(a) + items2[i][1]);
            else
                map.put(a, items2[i][1]);
        }
        // System.out.println(map);
        ArrayList<Integer> sortedKeys = new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys);

        for (Integer i : sortedKeys) {
            List<Integer> l = new ArrayList<>();
            l.add(i);
            l.add(map.get(i));
            result.add(l);
        }
        return result;
    }
}
