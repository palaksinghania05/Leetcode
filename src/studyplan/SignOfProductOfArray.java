/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 09-08-2022
 */

//Product 1822
package studyplan;

import java.math.BigInteger;

public class SignOfProductOfArray {
    public static void main(String[] args) {
        int[] arr = {9, 72, 34, 29, -49, -22, -77, -17, -66, -75, -44, -30, -24};
        System.out.println(arraySign(arr));
    }

    public static int arraySign(int[] nums) {
        BigInteger product = BigInteger.ONE;
        for (int i = 0; i < nums.length; i++) {
            product = product.multiply(BigInteger.valueOf(nums[i]));
           // System.out.println(product);
        }
        return signFunc(product);
    }

    public static int signFunc(BigInteger product) {
        int val = product.compareTo(BigInteger.ZERO);
        return val;
    }
}
