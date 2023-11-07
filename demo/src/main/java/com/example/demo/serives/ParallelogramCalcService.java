package com.example.demo.serives;

import org.springframework.stereotype.Service;

@Service
public class ParallelogramCalcService {
    public double getParallelogramSquare(double a, double b) {
        return a * b;
    }
    public double getParallelogramPer(double a, double b) {
        return (a + b) * 2;
    }
    public double getParallelogramHeight(double a, double b) {
        return a / b;
    }
}
