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
    void add() {
        // Förväntat resultat
        int expected = 15;

        // Anropa add()-metoden
        int result = calculator.add(num1, num2);

        // Kontrollera att resultatet är korrekt
        assertEquals(expected, result, "add() metoden bör returnera summan av två tal");
    }

    @org.junit.jupiter.api.Test
    void addFail() {
        // Förväntat resultat
        int expected = 20;

        // Anropa add()-metoden
        int result = calculator.add(num1, num2);

        // Kontrollera att resultatet är korrekt
        assertEquals(expected, result, "add() metoden bör returnera summan av två tal");
    }
}