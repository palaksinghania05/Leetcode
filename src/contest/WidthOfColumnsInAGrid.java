package contest;

import java.util.Arrays;

public class WidthOfColumnsInAGrid {
    public static void main(String[] args) {
        int[][] arr = {{-15, 1, 3}, {15, 7, 12}, {5, 6, -2}};
        System.out.println(Arrays.toString(findColumnWidth(arr)));
    }

    public static int[] findColumnWidth(int[][] grid) {
        int[] result = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                result[i] = Math.max(result[i], String.valueOf(grid[j][i]).length());
            }
        }
        return result;
    }
}
