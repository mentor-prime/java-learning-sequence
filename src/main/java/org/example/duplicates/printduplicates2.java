package org.example.duplicates;

public class printduplicates2 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 2, 1, 5, 5};
        printDuplicates(array);
    }

    public static int[] printDuplicates(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {

                    System.out.println("Duplicate: " +array[i]);
                    break;
                }
            }
        }
        return array;
    }
}


