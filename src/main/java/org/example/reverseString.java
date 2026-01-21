package org.example;

public class reverseString {

    public static void main(String[] args) {
        String string = "this is a string";
        System.out.println("Reversed string: " + reverseFunction(string));
    }

    public static String reverseFunction(String string) {
        char[] array = string.toCharArray();
        char[] reversedArray = new char[array.length];
        for (int i = array.length -1; i >= 0; i--) {
            reversedArray[array.length - i - 1] = array[i];
        }
        return new String(reversedArray);
    }
}


