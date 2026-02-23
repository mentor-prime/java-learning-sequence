/*
Bubble Sort Explanation:

1. Bubble sort works by repeatedly comparing adjacent elements.
2. If two adjacent elements are in the wrong order, they are swapped.
3. One full pass through the array places the largest unsorted element
   into its correct (final) position at the end.
4. Because only ONE element is guaranteed to be fixed per pass,
   multiple passes are required to fully sort the array.
5. After each pass, the last element is already sorted,
   so it is excluded from further comparisons.
6. This is why we need:
   - an outer loop (pass loop) → number of passes
   - an inner loop → adjacent comparisons in each pass

**** Pass 1
Compare 9 & 3 → swap
[1, 2, 3, 9, 4, 7, 6]

Compare 9 & 4 → swap
[1, 2, 3, 4, 9, 7, 6]

Compare 9 & 7 → swap
[1, 2, 3, 4, 7, 9, 6]

Compare 9 & 6 → swap
[1, 2, 3, 4, 7, 6, 9]
                   ↑
             Largest fixed

*** Pass 2
Compare 7 & 6 → swap
[1, 2, 3, 4, 6, 7, 9]
                ↑  ↑
          Second   Largest fixed

Without the outer "pass" loop:
- Only one traversal happens
- Only the largest element is guaranteed to move
- Remaining elements stay partially unsorted

Each pass guarantees:
- Exactly one element reaches its final position
*/

package org.example.sorting;

import java.util.Arrays;

public class bubbleSort2 {

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
}