package contest;

public class DetermineTheWinnerOfABowlingGame {
    public static void main(String[] args) {

    }

    public int isWinner(int[] player1, int[] player2) {
        int c1 = player1[0] + player1[1];
        int c2 = player2[0] + player2[0];
        for (int i = 2; i < player1.length; i++) {
            if (i == 0 || i == 1)
                c1 += player1[i];
            else if (player1[i - 1] == 10 || player1[i - 2] == 10)
                c1 += 2 * player1[i];
            else
                c1 += player1[i];
        }
        for (int i = 2; i < player2.length; i++) {
            if (i == 0 || i == 1)
                c2 += player2[i];
            if (player2[i - 1] == 10 || player2[i - 2] == 10)
                c2 += 2 * player2[i];
            else
                c2 += player2[i];
        }
        if (c1 > c2)
            return 1;
        else if (c2 > c1)
            return 2;
        else
            return 0;
    }
}
