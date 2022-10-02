/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 02-10-2022
 */

package contest;

public class MaximumSumOfHourglass {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(maxSum(matrix));
    }

    public static int maxSum(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[0].length - 2; j++) {
                int sum = grid[i][j] + grid[i][j + 1] + grid[i][j + 2] +
                        grid[i + 1][j + 1] + grid[i + 2][j] + grid[i + 2][j + 1] +
                        grid[i + 2][j + 2];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
