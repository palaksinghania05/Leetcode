/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 11-07-2022
 */

package medium;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 10, 5, 2};
        System.out.println(count(arr));
    }

    public static int count(int[] arr) {
//        for (int i = 1; i < arr.length-1; i++) {
//            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
//                return i;
//        }
//        return 0;
        int low = 1, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1])
                return mid;
            else if (arr[mid] > arr[mid + 1])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
