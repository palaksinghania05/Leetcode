/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 23-07-2022
 */

package contest;

import java.util.HashMap;

public class BestPokerHand {
    public static void main(String[] args) {
        int[] ranks = {4, 4, 2, 4, 4};
        char[] suits = {'d', 'a', 'a', 'b', 'c' };
        System.out.println(bestHand(ranks, suits));
    }

    public static String bestHand(int[] ranks, char[] suits) {
        int maxRank = 0;
        int maxOccurrence = 0;
        HashMap<Integer, Integer> countRank = new HashMap<>();
        for (int i = 0; i < ranks.length; i++) {
            if (!countRank.containsKey(ranks[i]))
                countRank.put(ranks[i], 1);
            else
                countRank.put(ranks[i], countRank.get(ranks[i]) + 1);
        }
        HashMap<Character, Integer> countSuit = new HashMap<>();
        for (int i = 0; i < suits.length; i++) {
            if (!countSuit.containsKey(suits[i]))
                countSuit.put(suits[i], 1);
            else
                countSuit.put(suits[i], countSuit.get(suits[i]) + 1);
        }
        for (Character ch : countSuit.keySet()) {
            if (maxOccurrence <= countSuit.get(ch))
                maxOccurrence = countSuit.get(ch);
        }
        for (Integer i : countRank.keySet()) {
            if (maxRank <= countRank.get(i))
                maxRank = countRank.get(i);
        }
        if (maxOccurrence >= 5)
            return "Flush";
        else if (maxRank >= 3)
            return "Three of a Kind";
        else if (maxRank == 2)
            return "Pair";
        else
            return "High Card";
    }
}
