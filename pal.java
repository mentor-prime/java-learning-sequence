package org.example;

public class pal {

    public static void main(String[] args) {
    
        String word = "vidic";


    if (checkPalindrome(word) == true)
        System.out.println("Palindrome");
    else 
        System.out.println("Not a palindrome");
    }

    public static boolean checkPalindrome(String word) {

        char[] originalString = word.toCharArray();
        char[] reversedString = new char[originalString.length];


        for (int i = originalString.length - 1; i >= 0; i-- ) {
            
            reversedString[i] = originalString[originalString.length - 1];

        }

        for (int j = 0; j < originalString.length; j ++) {
            if (reversedString[i] != originalString[i]) {
                return false;
            }
        }

        return true;

    }

}
