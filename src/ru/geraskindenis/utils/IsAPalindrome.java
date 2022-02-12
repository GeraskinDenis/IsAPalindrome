package ru.geraskindenis.utils;

public class IsAPalindrome {
    public static boolean isAPalindrome(String line) {
        if (line.length() == 0 || line.length() == 1) {
            return true;
        }
        char[] chars = line.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if(chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAPalindrome(int number) {
        String line = Integer.toString(number);
        return isAPalindrome(line);
    }
}
