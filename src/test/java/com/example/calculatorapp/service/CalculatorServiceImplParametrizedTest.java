package com.example.calculatorapp.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParametrizedTest {
    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    private static Stream<Arguments> nums() {
        return Stream.of(
                Arguments.of(5, 2),
                Arguments.of(5, -10),
                Arguments.of(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @ParameterizedTest
    @MethodSource("nums")
    void plus(int num1, int num2) {
        long actual = calculatorService.plus(num1, num2);
        assertEquals((long) num1 + num2, actual);
    }

    @ParameterizedTest
    @MethodSource("nums")
    void minus(int num1, int num2) {
        long actual = calculatorService.minus(num1, num2);
        assertEquals((long) num1 - num2, actual);
    }

    @ParameterizedTest
    @MethodSource("nums")
    void multiply(int num1, int num2) {
        long actual = calculatorService.multiply(num1, num2);
        assertEquals((long) num1 * num2, actual);
    }

    @ParameterizedTest
    @MethodSource("nums")
    void divide(int num1, int num2) {
        double actual = calculatorService.divide(num1, num2);
        assertEquals((double) num1 / num2, actual);
    }
}