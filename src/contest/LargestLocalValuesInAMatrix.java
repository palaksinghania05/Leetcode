/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 14-08-2022
 */

package contest;

import java.util.Arrays;

public class LargestLocalValuesInAMatrix {
    public static void main(String[] args) {
        int[][] grid = {{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}}; //Answer: [[9,9],[8,6]]
        System.out.println(Arrays.toString(largestLocal(grid)));
    }

    public static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n - 2][n - 2];
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                maxLocal[i][j] = find(grid[i + 1][j + 1], grid, i + 1, j + 1);
            }
        }
        return maxLocal;
    }

    public static int find(int ele, int[][] grid, int i, int j) {
        int m1 = Math.max(grid[i - 1][j - 1], Math.max(grid[i][j - 1], grid[i + 1][j - 1]));
        int m2 = Math.max(grid[i - 1][j], Math.max(grid[i][j], grid[i + 1][j]));
        int m3 = Math.max(grid[i - 1][j + 1], Math.max(grid[i][j + 1], grid[i + 1][j + 1]));
        return Math.max(m1, Math.max(m2, m3));
    }
}
