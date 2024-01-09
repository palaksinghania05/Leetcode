package contest;

public class MaximumAreaofLongestDiagonalRectangle {
    public static void main(String[] args) {
        int[][] input = {{9, 3}, {8, 6}};
        System.out.println(areaOfMaxDiagonal(input));
    }

    public static int areaOfMaxDiagonal(int[][] dimensions) {
        int area = 0;
        double maxD = 0;
        for (int i = 0; i < dimensions.length; i++) {
            double diagonal = Math.sqrt(Math.pow(dimensions[i][0], 2) + Math.pow(dimensions[i][1], 2));
            if (diagonal > maxD) {
                area = dimensions[i][0] * dimensions[i][1];
                maxD = diagonal;
            } else if (diagonal == maxD)
                area = Math.max(area, dimensions[i][0] * dimensions[i][1]);
        }
        return area;
    }
}
