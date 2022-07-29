/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 25-07-2022
 */

//Problem 1688
package easy;

public class CountOfMatchesInTournament {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(numberOfMatches(n));
    }

    public static int numberOfMatches(int n) {
        int matches = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                matches = matches + n / 2;
                n = n / 2;
            } else {
                matches = matches + ((n - 1) / 2);
                n = (n - 1) / 2 + 1;
            }
        }
        return matches;
    }
}
