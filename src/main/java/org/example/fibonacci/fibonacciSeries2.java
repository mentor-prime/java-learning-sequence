package org.example.fibonacci;

public class fibonacciSeries2 {

    public static void main(String[] args) {

        fibonacci(10);

    }

    public static void fibonacci(int number) {

        int previous = 0;
        int current = 1;

        if (number >= 1) {
            System.out.println(previous);
        }
        if (number >= 2) {
            System.out.println(current);
        }

        for (int i = 2; i < number; i++) {
            int next = previous + current;
            System.out.println(next);
            previous = current;
            current = next;
        }


    }

}
