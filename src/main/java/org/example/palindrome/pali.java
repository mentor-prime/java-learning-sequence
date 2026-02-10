package org.example.palindrome;

public class pali {
    

    public static void main(String[] args) {
        // String word = "qwertyytrewq";
        String word = "civic";

        if (checkPalindrome(word) == true) {
            System.out.println("Palindrome");
        }
            
        else {
            System.out.println("X");
        }
            

    }

    public static boolean checkPalindrome(String word) {

        char[] originalString = word.toCharArray();
        char[] reversedString = new char[originalString.length];


        for (int i = 0; i < originalString.length; i++) {
            reversedString[i] = originalString[originalString.length - 1 - i];
        }


        for (int i = 0; i < originalString.length; i ++) {
            if (reversedString[i] != originalString[i])
                return false;
        }
        return true;
    }
}
