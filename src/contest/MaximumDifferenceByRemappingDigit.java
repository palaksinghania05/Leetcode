package contest;

public class MaximumDifferenceByRemappingDigit {
    public static void main(String[] args) {
        int num = 90;
        System.out.println(minMaxDifference(num));
    }

    public static int minMaxDifference(int num) {
        String s = String.valueOf(num);
        int min = num;
        int max = num;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                String remapped = s.replace(String.valueOf(i), String.valueOf(j));
                remapped = remapped.replaceAll("^0+(?!$)", "");
                if (remapped == "")
                    remapped = "0";
                if (Integer.valueOf(remapped) < min)
                    min = Integer.valueOf(remapped);
                if (Integer.valueOf(remapped) > max)
                    max = Integer.valueOf(remapped);
            }
        }
        return max - min;
    }
}
