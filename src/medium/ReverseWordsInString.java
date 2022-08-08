/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 08-08-2022
 */

package medium;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "a good   example";
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String s) {
        String result = "";
        s = s.trim();
        String word = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (word.length() != 0) {
                    result += rev(word) + " ";
                    //  System.out.println(word);
                    word = "";
                }
            } else {
                word += s.charAt(i);
                //  System.out.println(word);
            }
        }
        result += rev(word);
        return result;
    }

    public static String rev(String w) {
        String out = "";
        for (int i = w.length() - 1; i >= 0; i--) {
            out += w.charAt(i);
        }
        //  System.out.println(out);
        return out;
    }
}
