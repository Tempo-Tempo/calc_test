package com.example.demo.serives;

import org.springframework.stereotype.Service;

@Service
public class TrapezoidCalcService {
    public double getTrapezoidSquare(double a, double b, double c) {
        return (a + b) * c / 2;
    }
    public double getTrapezoidPer(double a, double b, double c, double d) {
        return a + b + c + d;
    }
}
