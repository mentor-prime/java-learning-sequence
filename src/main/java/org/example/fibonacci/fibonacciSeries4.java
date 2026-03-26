package org.example.fibonacci;

public class fibonacciSeries4 {

    public static void main(String[] args) {
        printSequence(20);
    }

    public static void printSequence(int number) {
        int previous = 0;
        int current = 1;
        if (number == 0) {System.out.println(previous );}
        if (number == 1) {System.out.println(current );}
        for (int i = 2; i < number; i++) {
            int next = previous + current;
            previous = current;
            current = next;
            System.out.println(next);
        }
    }
}
