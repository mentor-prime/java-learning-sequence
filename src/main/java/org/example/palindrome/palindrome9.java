package org.example.palindrome;

public class palindrome9 {

    public static void main(String[] args) {

        String word = "hello";
        System.out.println(checkPalindrome(word) ? "Palindrome" : "Not a palindrome" );

    }

    public static boolean checkPalindrome(String word) {

        char[] originalString = word.toCharArray();
        char[] reversedString = new char[originalString.length];


        for (int i = 0; i < originalString.length; i++) {
            reversedString[i] = originalString[originalString.length - 1 - i];
        }

        System.out.println(reversedString);

        for (int i = 0; i < originalString.length; i ++) {
            if (reversedString[i] != originalString[i]) {
                return false;
            }

        }
        return true;
    }


}
