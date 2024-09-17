package org.example;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;
    int num1;
    int num2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        calculator = new Calculator();
        num1 = 10;
        num2 = 5;
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
        int expected = 15;
        int result = calculator.add(num1, num2);
        assertEquals(expected, result, "add() method should return the sum of two numbers");
    }

//    @org.junit.jupiter.api.Test
//    void testAddFail() {
//        int expected = 20;
//        int result = calculator.add(num1, num2);
//        assertEquals(expected, result, "add() method should return the sum of two numbers");
//    }

}