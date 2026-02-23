package org.example.stringReverse;

public class reverseString4 {

    public static void main(String[] args) {
        String string = "this is a string";
        System.out.println("Reversed string: " + reverseFunction(string));
    }

    public static String reverseFunction(String string) {

        char[] originalString = string.toCharArray();
        char[] reverseString = new char[originalString.length];

        for (int i = originalString.length - 1; i >= 0; i --) {
            reverseString[i] = originalString[originalString.length - i - 1];
        }

        return new String(reverseString);
    }

}
