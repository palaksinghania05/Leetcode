package contest;

public class TakeGiftFromRichestPile {
    public static void main(String[] args) {
        int[] gifts = {1, 1, 1, 1};
        int k = 4;
        System.out.println(pickGifts(gifts, k));
    }

    public static long pickGifts(int[] gifts, int k) {
        for (int i = 0; i < k; i++) {
            int idx = findRichest(gifts);
            gifts[idx] = (int) Math.floor(Math.sqrt(gifts[idx]));
        }
        // System.out.println(Arrays.toString(gifts));
        long result = 0;
        for (int i = 0; i < gifts.length; i++) {
            result += gifts[i];
        }
        return result;
    }

    public static int findRichest(int[] arr) {
        int max = arr[0];
        int idx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                idx = i;
            }
        }
        return idx;
    }
}
