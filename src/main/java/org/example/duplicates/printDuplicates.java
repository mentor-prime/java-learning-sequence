package org.example.duplicates;

class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 2};
        printDuplicates(array);
    }

    public static void printDuplicates(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    System.out.println("Duplicate value: " + array[i]);
                    break; // Avoid printing same duplicate multiple times for same i
                }

            }
        }
    }
}