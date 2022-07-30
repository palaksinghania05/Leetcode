/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 30-07-2022
 */

package easy;

public class DefangingIPAddress {
    public static void main(String[] args) {
        String s1 = "1.1.1.1";
        String s2 = "255.255.255.0";
        System.out.println(defangIPaddr(s1));
        System.out.println(defangIPaddr(s2));
    }

    public static String defangIPaddr(String address) {
        address = address.replaceAll("\\.", "[.]");
        return address;
    }
}
