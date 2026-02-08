package org.example;

public class pa {
    
    public static void main(String[] args) {

        // String word = "techno";
        String word = "civic";
        if (checkPalindrome(word) == true) { 
            System.out.println("Palindrome"); 
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public static boolean checkPalindrome(String word) {
        char[] originalString = word.toCharArray();
        char[] revsersedString = new char[originalString.length];

        for (int i = originalString.length -1; i >= 0; i-- ) {
            revsersedString[i] = originalString[originalString.length - 1 -i];
        }

        System.out.println(revsersedString);
        System.out.println(originalString);


        for (int i = 0; i < originalString.length; i++) {
            if (revsersedString[i] != originalString[i]) {
                return false;
            }
        }
        return true;
    }
}
