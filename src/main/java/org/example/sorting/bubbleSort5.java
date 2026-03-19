package org.example.sorting;

import java.util.Arrays;

public class bubbleSort5 {
    public static void main(String[] args) {
        int[] array = {8, 2, 1, 9, 4, 6, 7};
        System.out.println("Sorted array: " + Arrays.toString(sort(array)));
        System.out.println("Second highest number: " + secondHighestNumber(array));
    }

    public static int[] sort(int[] list) {
        int temp;
        for (int a = 0; a < list.length - 1; a++) {
            for (int i = 0; i < list.length - 1 - a; i++) {
                if (list[i] > list[i + 1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
        return list;
    }

    public static int secondHighestNumber(int[] list) {
        sort(list);
        return list[list.length - 2];
    }

//    public static int secondHighestNumber(int[] list) {
//        sort(list);
//        return list[list.length - 2];
//    }

}
