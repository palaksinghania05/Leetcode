/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 01-08-2022
 */

//Problem 1491
package studyplan;

public class AverageSalary {
    public static void main(String[] args) {
        int[] salary = {4000, 3000, 1000, 2000};
        System.out.println(average(salary));
    }


    public static double average(int[] salary) {
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < salary.length; i++) {
            minSalary = Math.min(minSalary, salary[i]);
            maxSalary = Math.max(maxSalary, salary[i]);
        }
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            if (minSalary != salary[i] && maxSalary != salary[i])
                sum += salary[i];
        }
        return sum / (salary.length - 2);
    }
}
