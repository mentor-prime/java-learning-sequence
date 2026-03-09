package org.example.OOP.abstraction.calculator;

class BasicCalculator extends Calculator {

    @Override
    int add(int a, int b) {
        return a + b;
    }

    @Override
    int subtract(int a, int b) {
        return a - b;
    }
}
