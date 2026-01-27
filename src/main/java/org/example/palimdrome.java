package org.example;

public class palimdrome {

    public static void main(String[] args) {
        String word = "civic";
        System.out.println();
        if (checkPalindrome(word) == true) {
            System.out.print("Provided word is a palimdrome");
        } else {
            System.out.println("Not a palimdrome");
        }
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
