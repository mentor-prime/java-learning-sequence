package org.example.fibonacci;

public class fibonacci2 {

    public static void main(String[] args) {

        int number = 0;
        System.out.println("Fibonacci sequence: " + fibonacci(number));

    }


    public static int fibonacci(int number) {

        int previous = 0;
        int current = 1;
        int next = 1;

        if (number == 0) {
            return 0;
        }

        if (number == 1)
            return 1;

        for (int i = 0; i < number; i++) {
            next = previous + current;
            previous = current;
            current = next;

            System.out.println(next);
        }

        return next;
    }

}
