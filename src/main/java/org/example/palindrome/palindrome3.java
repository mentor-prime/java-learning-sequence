// Given a word "123321" check whether the word is a palindrome or not...

package org.example.palindrome;

public class palindrome3 {

    public static void main(String[] args) {
        String string = "123321";
        System.out.println(checkPalindrome(string) ? "Palindrome" : "NO Palindrome");
    }

    public static boolean checkPalindrome(String word) {
        char[] originalString = word.toCharArray();
        char[] reversedString = new char[originalString.length];
        for (int i = originalString.length - 1; i >= 0; i--) {
            reversedString[i] = originalString[originalString.length - 1 -i];
        }
        System.out.println(reversedString);
        for (int i = 0; i < originalString.length; i++) {
            if (reversedString[i] != originalString[i])
                return false;
        }
        return true;
    }


}
