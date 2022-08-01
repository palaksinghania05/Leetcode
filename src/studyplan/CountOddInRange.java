/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 01-08-2022
 */

//Problem 1523
package studyplan;

public class CountOddInRange {
    public static void main(String[] args) {
        int low = 3;
        int high = 7;
        System.out.println(countOdds(low, high));
    }


    public static int countOdds(int low, int high) {
//        int count = 0;
//        for (int i = low; i <= high; i++) {
//            if(i%2!=0)
//                count++;
//        }
//        return count;

        int range = (high - low) + 1;
        return high % 2 == 1 && low % 2 == 1 ? (range / 2) + 1 : range / 2;
    }
}
