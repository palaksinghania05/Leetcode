/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 04-08-2022
 */

//Problem 1672
package easy;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] account = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(account));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] customers : accounts) {
            int sum = 0;
            for (int i = 0; i < customers.length; i++)
                sum = sum + customers[i];

            if (maxWealth < sum)
                maxWealth = sum;
        }
        return maxWealth;
    }
}
