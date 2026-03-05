package org.example.palindrome;

public class palindrome12 {

    public static void main(String[] args) {
        String tc1 = "123321";
        String tc2 = "123";
        String tc3 = "123321123321";
        System.out.println(checkPalindrome(tc1) ? "Palindrome" : "Not a palindrome" );
        System.out.println(checkPalindrome(tc2) ? "Palindrome" : "Not a palindrome" );
        System.out.println(checkPalindrome(tc3) ? "Palindrome" : "Not a palindrome" );
    }

    public static boolean checkPalindrome(String string) {
        char[] originalString = string.toCharArray();
        char[] reversedString = new char[originalString.length];
        for (int i = 0; i < originalString.length; i++) {
            reversedString[i] = originalString[originalString.length - 1 - i];
        }
        System.out.println(reversedString);
        for (int i = 0; i < originalString.length; i++) {
            if (reversedString[i] != originalString[i]) {
                return false;
            }
        }

        return true;
    }
}
