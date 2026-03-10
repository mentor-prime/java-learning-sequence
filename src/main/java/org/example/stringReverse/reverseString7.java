package org.example.stringReverse;

public class reverseString7 {
    public static void main(String[] args) {
        String string = "string";
        System.out.println("Reversed string: " + reverseFunction(string));
    }



    public static String reverseFunction(String string) {
        char[] originalString = string.toCharArray();
        char[] reversedString = new char[originalString.length];
        for (int i = 0; i < originalString.length; i++) {
            reversedString[i] = originalString[originalString.length -1 - i];
        }
        return new String(reversedString);
    }
}
