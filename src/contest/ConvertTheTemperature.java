/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 13-11-2022
 */

package contest;

import java.util.Arrays;

public class ConvertTheTemperature {
    public static void main(String[] args) {
        double celsius = 36.50;
        System.out.println(Arrays.toString(convertTemperature(celsius)));
    }

    public static double[] convertTemperature(double celsius) {
//        double[] result = new double[2];
//        double kelvin = celsius+273.15;
//        double fahrenheit = celsius * 1.80 + 32.00;
//        result[0] = Double.parseDouble(String.format("%.5f",kelvin));
//        result[1] = Double.parseDouble(String.format("%.5f",fahrenheit));
//        return result;
        double[] ans = new double[2];
        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.80 + 32.00;
        return ans;
    }
}
