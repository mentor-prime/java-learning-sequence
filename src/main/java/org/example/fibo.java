package org.example;

public class fibo {

    public static void main(String[] args) {
        int number = 10;
        System.out.println("Sequennce:" + fiboCalculator(number));
    }

    public static int fiboCalculator(int number) {
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
