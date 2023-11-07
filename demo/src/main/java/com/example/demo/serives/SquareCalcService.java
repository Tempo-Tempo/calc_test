package com.example.demo.serives;

import org.springframework.stereotype.Service;

@Service
public class SquareCalcService {
    public double getSquaredSquare(double a) {
        return a * 4;
    }
    public double getSquaredPer (double a) {
        return a * 4;
    }
    public double getSquaredRadius (double a) {
        return (a / 2) * a * 4;
    }
    public double getSquaredOpi(double a) {
        return (a * a * 2) * 3.14;
    }
}
