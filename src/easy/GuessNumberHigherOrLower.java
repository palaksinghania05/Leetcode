/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 10-07-2022
 */

//Problem 374
package easy;

import java.util.Scanner;

import static easy.GuessNumber.guess;

public class GuessNumberHigherOrLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        System.out.println(guessNumber(n));
    }

    public static int guessNumber(int n) {
        int low = 1, high = n, mid = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (guess(mid) == -1) {
                high = mid - 1;
            } else if (guess(mid) == 1) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

class GuessNumber {
    static int pick = 6;

    static int guess(int n) {
        if (n > pick)
            return -1;
        else if (n < pick)
            return 1;
        else
            return 0;
    }
}
