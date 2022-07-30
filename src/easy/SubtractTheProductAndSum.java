/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 30-07-2022
 */

//Problem 1281
package easy;

public class SubtractTheProductAndSum {
    public static void main(String[] args) {
        int n1 = 234;
        int n2 = 4421;
        System.out.println(subtractProductAndSum(n1));
        System.out.println(subtractProductAndSum(n2));
    }

    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            product = product * digit;
            sum = sum + digit;
            n = n / 10;
        }
        return product - sum;
    }
}
