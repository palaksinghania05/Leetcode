package contest;

import java.util.ArrayList;

public class CountTheNumberOfVowelStringInRange {
    public static void main(String[] args) {
        String[] words = {"hey", "aeo", "mu", "ooo", "artro"};
        int left = 1;
        int right = 4;
        System.out.println(vowelStrings(words, left, right));
    }

    public static int vowelStrings(String[] words, int left, int right) {
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int result = 0;
        for (int i = left; i <= right; i++) {
            int n = words[i].length();
            if (vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(n - 1)))
                result++;
        }
        return result;
    }
}
