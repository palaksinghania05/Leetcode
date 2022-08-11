/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 11-08-2022
 */

//Product 1502
package studyplan;

import java.util.Arrays;

public class CanMakeArithmeticProgression {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        System.out.println(canMakeArithmeticProgression(arr));
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != diff)
                return false;
        }
        return true;
    }
}
