package org.example.duplicates;

public class findDuplicates5 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2};
        findDuplicates(array);
    }

    public static void findDuplicates(int[] array) {
        for (int i = 0 ; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j ++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate: " + array[j]);
                }
            }
        }
    }
}
