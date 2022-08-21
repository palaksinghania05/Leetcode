/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 21-08-2022
 */

package contest;

public class MinimumNumbersOfTraining {
    public static void main(String[] args) {
        int initialEnergy = 2;
        int initialExperience = 4;
        int[] energy = {1};
        int[] experience = {3};
        System.out.println(minNumberOfHours(initialEnergy, initialExperience, energy, experience));
    }

    public static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int hours = 0;
        for (int i = 0; i < energy.length; i++) {
            if (initialEnergy <= energy[i]) {
                int diff = energy[i] - initialEnergy + 1;
                hours += diff;
                initialEnergy += diff;
            }
            initialEnergy -= energy[i];
        }

        for (int i = 0; i < experience.length; i++) {
            if (initialExperience <= experience[i]) {
                int diff = experience[i] - initialExperience + 1;
                hours += diff;
                initialExperience += diff;
            }
            initialExperience += experience[i];
        }

        return hours;
    }
}
