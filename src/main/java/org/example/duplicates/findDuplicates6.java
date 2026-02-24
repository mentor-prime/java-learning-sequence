package org.example.duplicates;

import java.util.Arrays;

public class findDuplicates6 {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 2, 1, 2, 3, 4, 5, 5};
        String[] stringArray = {"a", "b", "a", "d", "c"};

        findDuplicatesInt(intArray);
        findDuplicateString(stringArray);
    }

    public static void findDuplicatesInt(int[] array) {
        System.out.println("Duplicate ints:");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[j]);
                    break;
                }
            }
        }
    }

    public static void findDuplicateString(String[] array) {
        System.out.println("Duplicate strings:");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    System.out.println(array[j]);
                    break;
                }
            }
        }
    }


}
