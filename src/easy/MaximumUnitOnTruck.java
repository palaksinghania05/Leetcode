/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 06-07-2022
 */

package easy;

import java.util.Arrays;
import java.util.HashMap;

public class MaximumUnitOnTruck {
    public static void main(String[] args) {
        int[][] arr = {{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        int k = 10;
        System.out.println(maximumUnits(arr, k));
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < boxTypes.length; i++) {
            map.put(boxTypes[i][0], boxTypes[i][1]);
        }
        Object[] a = map.values().toArray();
        Arrays.sort(a);
        //  System.out.println(Arrays.toString(a));
        int units = 0;
        int i = a.length - 1;
        while (truckSize > 0 && i >= 0) {
            int key = getKeyFromValue((Integer) a[i], map);
            int val = (Integer) a[i];
            int num = (truckSize >= key ? key * val : truckSize * val);
            units = units + num;
//            System.out.println("units = " + units);
            truckSize = truckSize - key;
            i--;
        }
        return units;
    }

    public static int getKeyFromValue(int val, HashMap<Integer, Integer> map) {
        for (Integer i : map.keySet()) {
            if (map.get(i) == val)
                return i;
        }
        return 0;
    }
}
