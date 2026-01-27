package org.example;

public class palin {


    public static void main(String[] args) {

        String word = "1233211";

        if (checkPalindrome(word) == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }

    public static boolean checkPalindrome(String word) {

        char[] originalString = word.toCharArray();
        char[] reversedString = new char[originalString.length];

        for (int i = 0; i < originalString.length ; i ++) {
            reversedString[i] = originalString[originalString.length - i - 1];
        }

        for (int i = 0; i < originalString.length; i ++ ) {
            if (reversedString[i] != originalString[i])
                return false;
        }
        return true;
    }
}
