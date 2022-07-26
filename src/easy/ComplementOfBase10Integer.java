/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 26-07-2022
 */

package easy;

import java.util.Scanner;

public class ComplementOfBase10Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        System.out.println(bitwiseComplement(n));
    }

    public static int bitwiseComplement(int n) {
        String bin = Integer.toBinaryString(n);
        String binOut = "";
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1')
                binOut = binOut + '0';
            else
                binOut = binOut + '1';
        }
        return Integer.parseInt(binOut, 2);
    }
}
