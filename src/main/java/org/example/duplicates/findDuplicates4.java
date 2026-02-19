package org.example.duplicates;

public class findDuplicates4 {

    public static void main(String[] args) {

        int[] array = {1,2,3,2,2,1,3,4,5};
        // System.out.println("Duplicates: " + findDuplicates(array));
        findDuplicates(array);
    }

    public static void findDuplicates(int[] array) {
        for (int i = 0; i < array.length; i ++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("duplicate: " + array[j]);
                }
            }
        }
    }

}
