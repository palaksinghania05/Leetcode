/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 18-12-2022
 */

package contest;

public class CountPairsWithSimilarStrings {
    public static void main(String[] args) {
        String[] arr = {"aba", "aabb", "abcd", "bac", "aabc"};
        System.out.println(similarPairs(arr));
    }

    public static int similarPairs(String[] words) {
        int n = words.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                boolean f = false;
                for (int k = 0; k < 26; k++) {
                    char ch = (char) ('a' + k);
                    if ((words[i].indexOf(ch) == -1 && words[j].indexOf(ch) != -1) ||
                            (words[i].indexOf(ch) != -1 && words[j].indexOf(ch) == -1)) {
                        f = true;
                        break;
                    }
                }
                if (!f)
                    ans++;
            }
        }
        return ans;
    }
}
