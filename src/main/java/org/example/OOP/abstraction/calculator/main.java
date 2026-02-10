package org.example.OOP.abstraction.calculator;

public class main {

    public static void main(String[] args) {

        // Reference is of abstract type Calculator
        // Object is of concrete type BasicCalculator
        Calculator calc = new BasicCalculator();

        // User uses calculator methods
        // Implementation details are hidden
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
    }
}
