package com.example.calculatorapp.service;

import com.example.calculatorapp.exeption.DivideException;
import org.springframework.stereotype.Service;

import java.util.zip.DataFormatException;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String hello() {
        return null;
    }

    @Override
    public long plus(int num1, int num2) {
        return (long) num1 + num2;
    }

    @Override
    public long minus(int num1, int num2) {
        return (long) num1 - num2;
    }

    @Override
    public long multiply(int num1, int num2) {
        return (long) num1 * num2;
    }

    @Override
    public double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new DivideException("Нельзя делить на 0");
        }
        return (double) num1 / num2;
    }
}