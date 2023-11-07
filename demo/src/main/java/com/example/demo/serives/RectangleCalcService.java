package com.example.demo.serives;

import org.springframework.stereotype.Service;

@Service
public class RectangleCalcService {
    public double getRectangleSquare(double a, double b) {
        return a * b;
    }
    public double getRectanglePer(double a, double b) {
        return (a + b) * 2;
    }
}
