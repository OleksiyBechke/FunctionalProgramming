package app;

public class StringListProcessor {
    public static int countUppercase(String s){
        if (s == null) {
            return 0;
        }

        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }
}
