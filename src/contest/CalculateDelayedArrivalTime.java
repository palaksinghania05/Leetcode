package contest;

public class CalculateDelayedArrivalTime {
    public static void main(String[] args) {
        int arrivalTime = 15;
        int delayedTime = 5;
        System.out.println(findDelayedArrivalTime(arrivalTime, delayedTime));
    }

    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int result = arrivalTime + delayedTime;
        if (result >= 24)
            return result - 24;
        else
            return result;
    }
}
