/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 26-03-2022
 */

package easy;

import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int integer = 0;
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (i == 0) {
                integer += predefinedTable(character);
            } else {
                char previousChar = s.charAt(i - 1);
                if (predefinedTable(previousChar) < predefinedTable(character))
                    integer += predefinedTable(character) - 2 * predefinedTable(previousChar);
                else
                    integer += predefinedTable(character);
            }
        }
        return integer;
    }

    public static int predefinedTable(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.next();
        System.out.println(romanToInt(roman));
    }
}
