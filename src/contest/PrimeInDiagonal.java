package contest;

import java.util.ArrayList;
import java.util.Collections;

public class PrimeInDiagonal {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {5, 17, 7}, {9, 11, 10}};
        System.out.println(diagonalPrime(arr));
    }

    public static int diagonalPrime(int[][] nums) {
        int start = 0, end = nums.length - 1;
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i][i]))
                a.add(nums[i][i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i][nums.length - i - 1]))
                a.add(nums[i][nums.length - i - 1]);
        }
        int max = a.size();
        if (max <= 0)
            return 0;
        else
            return Collections.max(a);

        /*int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i==j || i+j==nums.length-1){
                    if(isPrime(nums[i][j]))
                        result = Math.max(result,nums[i][j]);
                }
            }
        }
        return result;
    }
    */
    }

    public static boolean isPrime(long n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
        /*int i = 2;
        boolean flag = false;
        while(i<=n/2){
            if(n%i==0){
                flag = true;
                break;
            }
            i++;
        }
        if(!flag)
            return true;
        else
            return false;*/
}
