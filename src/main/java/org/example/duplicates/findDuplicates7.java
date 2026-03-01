package org.example.duplicates;

public class findDuplicates7 {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 2, 1, 2, 3, 4, 5, 5};
        String[] stringArray = {"a", "b", "a", "d", "c"};

        findDuplicatesInt(intArray);
    //    findDuplicateString(stringArray);
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




}
