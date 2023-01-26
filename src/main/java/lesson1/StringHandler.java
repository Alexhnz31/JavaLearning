package lesson1;

import java.time.LocalDateTime;

public class StringHandler {
    public String stringConcat(String string1, String string2) {
        checkIfStringEmpty(string1);
        checkIfStringEmpty(string2);
        return string1.concat(string2);
    }

    public String equalsTwoString(String string, String string2) {
        if (string.equals(string2)) {
            return "Strings are equals";
        }
        return String.valueOf(LocalDateTime.now());
    }

    public int countSymbols(String string) {
        checkIfStringEmpty(string);
        return string.replace(" ", "").length();
    }

    public String reverseString(String string) {
        checkIfStringEmpty(string);
        String reverseString = "";
        for (int i = 0; i < string.length(); i++) {
            reverseString = string.charAt(i) + reverseString;
        }
        if (string.equals(reverseString)) {
            return String.valueOf(LocalDateTime.now());
        }
        return reverseString;
    }

    private void checkIfStringEmpty(String string) {
        if (string.isEmpty()) {
            throw new IllegalArgumentException("String is Empty");
        }
    }
}
