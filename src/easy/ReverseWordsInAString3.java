/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 07-07-2022
 */

//Problem 557
package easy;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWordsInAString3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                result += arr[i].charAt(j);
            }
            result += " ";
        }
        System.out.println(result);
    }
}
