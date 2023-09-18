package com.example.calculatorapp.service;

import com.example.calculatorapp.exeption.DivideException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    int num1 = 3;
    int num2 = 2;


    @Test
    void plus_shouldReturnPositiveNumWhenNum1AndNum2Positive() {
        long actual = calculatorService.plus(num1, num2);
        assertEquals((long) num1 + num2, actual);
    }

    @Test
    void plus_shouldReturnPositiveNumWhenNum1PositiveNum2NegativeAndNum2Bigger() {
        int num2 = -10;
        long actual = calculatorService.plus(num1, num2);
        assertEquals((long) num1 + num2, actual);
    }

    @Test
    void minus_shouldReturnPositiveNumWhenNum1AndNum2PositiveAndNum2Less() {
        long actual = calculatorService.minus(num1, num2);
        assertEquals((long) num1 - num2, actual);
    }

    @Test
    void minus_shouldReturnPositiveNumWhenNum1PositiveNum2NegativeAndNum2Bigger() {
        int num2 = -10;
        long actual = calculatorService.minus(num1, num2);
        assertEquals((long) num1 - num2, actual);
    }

    @Test
    void multiply_shouldReturnPositiveNumWhenNum1AndNum2Positive() {
        long actual = calculatorService.multiply(num1, num2);
        assertEquals((long) num1 * num2, actual);
    }

    @Test
    void multiply_shouldReturnNegativeNumWhenNum1PositiveNum2Negative() {
        int num2 = -10;
        long actual = calculatorService.multiply(num1, num2);
        assertEquals((long) num1 * num2, actual);
    }

    @Test
    void divide_shouldReturnPositiveNumWhenNum1AndNum2Positive() {
        double actual = calculatorService.divide(num1, num2);
        assertEquals((double) num1 / num2, actual);
    }

    @Test
    void divide_shouldReturnNegativeNumWhenNum1PositiveNum2Negative() {
        int num2 = -10;
        double actual = calculatorService.divide(num1, num2);
        assertEquals((double) num1 / num2, actual);
    }

    @Test
    void divide_shouldReturnIllegalArgumentExceptionWhenNum2Is0() {
        int num2 = 0;
        assertThrows(DivideException.class, ()->calculatorService.divide(num1, num2));
    }
}