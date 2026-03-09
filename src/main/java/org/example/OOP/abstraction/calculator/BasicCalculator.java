package org.example.OOP.abstraction.calculator;

class BasicCalculator extends Calculator {

    // Implementation of add method
    @Override
    int add(int a, int b) {
        return a + b;
    }

    // Implementation of subtract method
    @Override
    int subtract(int a, int b) {
        return a - b;
    }
}
