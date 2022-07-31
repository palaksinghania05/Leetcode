/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 31-07-2022
 */

package contest;

import java.util.Arrays;

public class MaximumNumberOfGroupsEnteringACompetition {
    public static void main(String[] args) {
        int[] grades = {10, 6, 12, 7, 3, 5};
        System.out.println(maximumGroups(grades));
    }

    public static int maximumGroups(int[] grades) {
        int students = grades.length;
        int groupLength = 1;
        int groupCount = 0;
        Arrays.sort(grades);
        while (students > 0) {
            if (groupLength > students)
                break;
            students = students - groupLength;
            groupCount++;
            groupLength++;
        }
        return groupCount;
    }
}
