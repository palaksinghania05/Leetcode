package contest;

public class PassThePillow {
    public static void main(String[] args) {
        int n = 8;
        int time = 9;
        System.out.println(passThePillow(n, time));
    }

    public static int passThePillow(int n, int time) {
        int result = 1;
        int flag = 0;
        while (time > 0) {
            if (flag == 0) {
                result += 1;
                if (result == n)
                    flag = 1;
            } else {
                result -= 1;
                if (result == 1)
                    flag = 0;
            }
            time -= 1;
        }
        return result;
    }
}
