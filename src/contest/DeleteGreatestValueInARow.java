/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 11-12-2022
 */

package contest;

import java.util.Arrays;

public class DeleteGreatestValueInARow {
    public static void main(String[] args) {
        int[][] grid = {{10}};
        System.out.println(deleteGreatestValue(grid));
    }

    public static int deleteGreatestValue(int[][] grid) {
        for (int[] ints : grid) {
            Arrays.sort(ints);
        }
        int max = 0;
        int[] result = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] > max)
                    max = grid[j][i];
            }
            result[i] = max;
            max = 0;
        }
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum = sum + result[i];
        }
        return sum;
    }
}
