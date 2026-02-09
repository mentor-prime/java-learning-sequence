// Take a number lets say 11 and write a program to print Fibonacci series up to n terms.

package org.example.fibonacci;

public class fibonacci1 {

    public static void main(String[] args) {
        int number = 10;
        System.out.println("Sequennce:" + fibonacci(number));
    }

    public static int fibonacci(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            int previous = 0;
            int current = 1;
            int next = 0;

            for (int i = 2; i <= number; i++) {
                next = current + previous;
                System.out.println(next + " ");
                previous = current;
                current = next;
            }
            return current;
        }
    }


}
