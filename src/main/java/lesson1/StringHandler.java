package lesson1;

import java.time.LocalDateTime;

public class StringHandler {
    public static String stringConcat(String string1, String string2) throws IllegalAccessException {
        if (string1.isEmpty() | string2.isEmpty()) {
            throw new IllegalArgumentException("String Empty");
        }
        return (string1.concat(string2));
    }

    public static String equalsTwoString(String string1, String string2) {
        if (string1.equals(string2)) {
            return "Строки Равны";
        }
        return String.valueOf(LocalDateTime.now());
    }

    public static int countSymbols(String string) {
        if (string == "") {
            throw new IllegalArgumentException("String is Empty");
        } else {
            return string.replace(" ", "").length();
        }
    }
    public static String reverseString(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            result = string.charAt(i) + result;
        }
        if (string == "") {
            throw new IllegalArgumentException("String is Empty");
        } else {
            return result;
        }
    }
}
