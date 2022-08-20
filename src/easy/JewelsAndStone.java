/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 20-08-2022
 */

//Problem 771
package easy;

import java.util.ArrayList;

public class JewelsAndStone {
    public static void main(String[] args) {
        String jewels = "z";
        String stones = "ZZ";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        ArrayList<Character> acceptedJewels = new ArrayList<>();
        for (int i = 0; i < jewels.length(); i++) {
            acceptedJewels.add(jewels.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (acceptedJewels.contains(stones.charAt(i)))
                count++;
        }
        return count;
    }
}
