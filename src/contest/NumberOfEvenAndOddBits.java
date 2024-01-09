package contest;

import java.util.Arrays;

public class NumberOfEvenAndOddBits {
    public static void main(String[] args) {
        int num = 17;
        System.out.println(Arrays.toString(evenOddBit(num)));
    }

    public static int[] evenOddBit(int n) {
        String original = Integer.toString(n, 2);
        int even = 0, odd = 0;
        StringBuffer reverse = new StringBuffer(original);
        reverse.reverse();
        String binary = reverse.toString();
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                if (i % 2 == 0)
                    even++;
                else
                    odd++;
            }
        }
        int[] answer = new int[2];
        answer[0] = even;
        answer[1] = odd;
        return answer;
    }
}
