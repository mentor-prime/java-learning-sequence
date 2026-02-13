package org.example.palindrome;

public class palindrome5 {

    public static void main(String[] args) {
        String keyword = "12344321";
        System.out.println(checkPalindrome(keyword) ? "Palindrome" : "NO Palindrome");
    }

    public static boolean checkPalindrome(String string) {
        char[] originalString = string.toCharArray();
        char[] reversedString = new char[originalString.length];
        for (int i = originalString.length - 1; i >= 0; i--) {
            reversedString[i] = originalString[i];
        }
        System.out.print(reversedString);
        for (int  i = 0; i < originalString.length; i++) {
            if (reversedString[i] != originalString[i]) {
                return false;
            }
        }
        return true;
    }
}
