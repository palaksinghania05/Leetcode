/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 23-10-2022
 */

package contest;

public class DetermineConflictInEvents {
    public static void main(String[] args) {
        String[] event1 = {"10:00", "11:00"};
        String[] event2 = {"14:00", "15:00"};
        System.out.println(haveConflict(event1, event2));
    }

    public static boolean haveConflict(String[] event1, String[] event2) {
        int c1 = event2[0].compareTo(event1[1]);
        int c2 = event2[1].compareTo(event1[0]);
        return (c1 <= 0) && (c2 >= 0);
//        if(event1[1].charAt(0)>event2[0].charAt(0))
//            return true;
//        else if(event1[1].charAt(0)<event2[0].charAt(0))
//            return false;
//        else{
//            if(event1[1].charAt(1)>event2[1].charAt(1))
//                return true;
//            else if(event1[1].charAt(1)<event2[1].charAt(1))
//                return false;
//            else{
//                if(event1[1].charAt(3)>event2[1].charAt(3))
//                    return true;
//                else if(event1[1].charAt(3)<event2[1].charAt(3))
//                    return false;
//                else{
//                    if(event1[1].charAt(4)>event2[1].charAt(4))
//                        return true;
//                    else if(event1[1].charAt(4)<event2[1].charAt(4))
//                        return false;
//                    else{
//                        return true;
//                    }
//                }
//            }
//        }
//            char[] arr1 = event1[1].toCharArray();
//            char[] arr2 = event2[0].toCharArray();
//            if (event1[0].charAt(0) > event2[0].charAt(0)) {
//                return false;
//            } else if (event1[0].charAt(0) == event2[0].charAt(0)) {
//                if (event1[0].charAt(1) > event2[0].charAt(1))
//                    return false;
//            } else {
//                if (arr1[0] == arr2[0]) {
//                    if (arr1[1]==arr2[1]) {
//                        if (arr1[3]==arr2[3]) {
//                            if (arr1[4] < arr2[4])
//                                return false;
//                        } else if (arr1[3] < arr2[3])
//                            return false;
//                    } else if (arr1[1] < arr2[1])
//                        return false;
//                } else if (arr1[0] < arr2[0])
//                    return false;
//            }
//            return true;
    }
}
