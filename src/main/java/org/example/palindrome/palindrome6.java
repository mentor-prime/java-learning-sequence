package org.example.palindrome;

public class palindrome6 {

    public static void main(String[] args) {

        // String word = "civic";
        String word = "civics";
        System.out.print(checkPalindrome(word) ? "Palindrome" : "Not a palindrome");

    }

    public static boolean checkPalindrome(String key) {
        char[] original = key.toCharArray();
        char[] reversed = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

}
