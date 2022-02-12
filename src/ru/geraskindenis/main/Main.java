package ru.geraskindenis.main;

import ru.geraskindenis.utils.IsAPalindrome;

public class Main {
    public static void main(String[] args) {
        System.out.println("'123321' is palindrome = " + IsAPalindrome.isAPalindrome("123321"));
        System.out.println("'1237321' is palindrome = " + IsAPalindrome.isAPalindrome("1237321"));
        System.out.println("'12345' is palindrome = " + IsAPalindrome.isAPalindrome("12345"));
        System.out.println();
        System.out.println("123321 is palindrome = " + IsAPalindrome.isAPalindrome(123321));
        System.out.println("1237321 is palindrome = " + IsAPalindrome.isAPalindrome(1237321));
        System.out.println("12345 is palindrome = " + IsAPalindrome.isAPalindrome(12345));
        System.out.println();
        System.out.println("'' is palindrome = " + IsAPalindrome.isAPalindrome(""));
        System.out.println("6 is palindrome = " + IsAPalindrome.isAPalindrome(6));

    }
}
