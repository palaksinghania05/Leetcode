/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 03-08-2022
 */

//Problem 1281
package studyplan;

public class SubtractTheProductAndSum {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
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
