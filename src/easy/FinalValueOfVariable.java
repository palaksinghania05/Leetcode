/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 05-08-2022
 */

//Problem 2011
package easy;

import java.util.Objects;

public class FinalValueOfVariable {
    public static void main(String[] args) {
        String[] opr = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(opr));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String s : operations) {
            if (Objects.equals(s, "--X") || Objects.equals(s, "X--"))
                X = X - 1;
            if (Objects.equals(s, "++X") || Objects.equals(s, "X++"))
                X = X + 1;
        }
        return X;
    }
}
