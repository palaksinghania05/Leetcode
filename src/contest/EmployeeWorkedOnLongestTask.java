/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 09-10-2022
 */

package contest;

public class EmployeeWorkedOnLongestTask {
    public static void main(String[] args) {
        int n = 26;
        int[][] logs = {{1, 1}, {3, 7}, {2, 12}, {7, 17}};
        System.out.println(hardestWorker(n, logs));
    }

    public static int hardestWorker(int n, int[][] logs) {
        int result = logs[0][0];
        int max = logs[0][1] - 0;
        for (int i = 1; i < logs.length; i++) {
            if (max < (logs[i][1] - logs[i - 1][1])) {
                max = logs[i][1] - logs[i - 1][1];
                result = logs[i][0];
            } else if (max == (logs[i][1] - logs[i - 1][1])) {
                result = Math.min(result, logs[i][0]);
            }

        }
        return result;
    }
}
