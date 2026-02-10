package org.example.palindrome;

public class palind {
    

    public static void main(String[] args) {

        String tc1 = "vivic";
        String tc2 = "civic";

        if (checkPalindrome(tc2) == true ) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }


    }


    public static boolean checkPalindrome(String string) {
        
        char[] originalString = string.toCharArray();
        char[] reversedString = new char[originalString.length];

        for (int i = originalString.length - 1; i >= 0; i--) {

                reversedString[i] = originalString[originalString.length - i -1];

        }

        System.out.println(reversedString);
        


        for(int i = 0; i < originalString.length; i++) {
            if (reversedString[i] != originalString[i]) {
                return false;   
            }
        }

        return true;


    }

}
