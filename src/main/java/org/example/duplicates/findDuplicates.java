package org.example.duplicates;

public class findDuplicates {

    public static void main(String[] args) {
        int[] array = {1,2, 2, 1, 3, 4, 5, 5, 1, 1};
        findDuplicate(array);
    }

    public static void findDuplicate(int[] array) {
        for (int  i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate value: " + array[j]);
                    break;
                }
            }
        }
    }
}
