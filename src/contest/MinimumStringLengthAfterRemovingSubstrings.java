package contest;

public class MinimumStringLengthAfterRemovingSubstrings {
    public static void main(String[] args) {
        String s = "ABFCACDB";
        System.out.println(minimumLength(s));
    }

    public static int minimumLength(String s) {
        if (!s.contains("AB") && !s.contains("CD")) {
            return s.length();
        }
        s = s.replace("AB", "");
        s = s.replace("CD", "");
        return minimumLength(s);
    }
}
