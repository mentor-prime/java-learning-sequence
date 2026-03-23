package org.example.stringReverse;

import java.util.Arrays;

public class reverseString10 {
    public static int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - i - 1];
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] result = reverseArray(array);
        System.out.println("Reversed array: " + Arrays.toString(result));
    }
}
