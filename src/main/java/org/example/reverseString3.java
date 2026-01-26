package org.example;

public class reverseString3 {

    public static void main(String[] args) {
        String string = "I love United States";
        System.out.println("Reversed String is: "+ reverseFunction(string));
    }

    public static String reverseFunction(String string) {
        char[] originalString = string.toCharArray();
        char[] reversedString = new char[originalString.length];
        for (int i = originalString.length - 1; i >= 0; i--) {
            reversedString[originalString.length -i -1] = originalString[i];
        }
        return new String(reversedString);
    }
}
