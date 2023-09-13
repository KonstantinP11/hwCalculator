package com.example.calculatorapp.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String hello() {
        return null;
    }

    @Override
    public int plus(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    @Override
    public int minus(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    @Override
    public int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    @Override
    public double divide(int num1, int num2) {
                if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        double result = (double) num1 / num2;
        return result;
    }
}