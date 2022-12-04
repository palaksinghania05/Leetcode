/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 04-12-2022
 */

package contest;

public class CircularSentences {
    public static void main(String[] args) {
        String sentence = "Leetcode is cool";
        System.out.println(isCircularSentence(sentence));
    }

    public static boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                if (words[words.length - 1].charAt(words[words.length - 1].length() - 1) == words[0].charAt(0))
                    return true;
            } else {
                if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0))
                    return false;
            }
        }
        return false;
    }
}
