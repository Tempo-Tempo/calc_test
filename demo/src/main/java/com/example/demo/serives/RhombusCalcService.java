package com.example.demo.serives;

import org.springframework.stereotype.Service;

@Service
public class RhombusCalcService {
    public double getRhombusSquare(double a, double b) {
        return (a * b) / 2;
    };

    public double getRhombusPer(double a) {
        return a * 4;
    };
}
