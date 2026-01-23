package org.example;

public class fibonacciSeries {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Fibonacci sequence:");
        fibonacci(number);
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