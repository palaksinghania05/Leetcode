package contest;

import java.util.HashSet;

public class MinimizeStringLength {
    public static void main(String[] args) {
        String s = "aaabc";
        System.out.println(minimizedStringLength(s));
    }

    public static int minimizedStringLength(String s) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        return set.size();
    }
}
