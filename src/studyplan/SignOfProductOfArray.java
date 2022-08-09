/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 09-08-2022
 */

//Product 1822
package studyplan;

public class SignOfProductOfArray {
    public static void main(String[] args) {
        int[] arr = {41, 65, 14, 80, 20, 10, 55, 58, 24, 56, 28, 86, 96, 10, 3, 84, 4, 41, 13, 32, 42, 43, 83, 78, 82, 70, 15, -41};
        System.out.println(arraySign(arr));
    }

    public static int arraySign(int[] nums) {
        long product = 1;
        for (int i = 0; i < nums.length; i++) {
            product = product * nums[i];
        }
        return signFunc(product);
    }

    public static int signFunc(long product) {
        if (product == 0)
            return 0;
        else if (product < 0)
            return -1;
        else
            return 1;
    }
}
