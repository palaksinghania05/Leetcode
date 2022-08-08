/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 07-08-2022
 */

//Problem 1779
package studyplan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindNearestPoint {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int[][] a = {{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}};
        int[][] b = {{3, 4}};
        int[][] c = {{2, 3}};
        int[][] d = {{1, 1}, {1, 1}};
        System.out.println(nearestValidPoint(x, y, d));
    }

    public static int nearestValidPoint(int x, int y, int[][] points) {
        HashMap<Integer, List<Integer>> validPoints = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            if (x == points[i][0] || y == points[i][1]) {
                List<Integer> l = new ArrayList<>();
                l.add(points[i][0]);
                l.add(points[i][1]);
                validPoints.put(i, l);
            }
        }
        System.out.println(validPoints);
        int distance = Integer.MAX_VALUE;
        int ind = 0;
        if (validPoints.size() == 0)
            return -1;
        else {
            for (List<Integer> l : validPoints.values()) {
                int val = Math.abs(x - l.get(0)) + Math.abs(y - l.get(1));
                if (distance > val) {
                    distance = val;
                    ind = findKey(l, validPoints);
                } else if (distance == val) {
                    if (ind > findKey(l, validPoints))
                        ind = findKey(l, validPoints);
                }
            }
        }
        return ind;
    }

    public static int findKey(List<Integer> l, HashMap<Integer, List<Integer>> map) {
        for (int i : map.keySet()) {
            if (map.get(i) == l)
                return i;
        }
        return 0;
    }
}
