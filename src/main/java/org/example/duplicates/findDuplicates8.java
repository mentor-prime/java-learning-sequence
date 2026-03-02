package org.example.duplicates;

public class findDuplicates8 {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 2, 1, 2, 3, 4, 5, 5};
        findDuplicatesInt(intArray);
    }

    public static void findDuplicatesInt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate value at index:" + j + " is " + array[j]);
                }
            }
        }
    }
}
