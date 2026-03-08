package org.example.palindrome;

public class palindrome14 {

    public static void main(String[] args) {
        String tc1 = "123321";
        System.out.println(checkPalindrome(tc1) ? "Palindrome" : "Not a palindrome" );
    }

    public static boolean checkPalindrome(String string) {
        char[] originialString = string.toCharArray();
        char[] reversedString = new char[originialString.length];

        for (int i = 0; i < originialString.length; i++) {
            reversedString[i] = originialString[originialString.length -i - 1];
        }

        System.out.println(reversedString);

        for (int i = 0; i < originialString.length; i ++) {
            if (reversedString[i] != originialString[i]) {
                return false;
            }
        }
        return true;
    }
}
