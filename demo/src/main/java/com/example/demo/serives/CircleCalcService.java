package com.example.demo.serives;

import org.springframework.stereotype.Service;

@Service
public class CircleCalcService {
    public double getCircleSquare (double a) {
        return 3.14 * (a * a);
    }
    public double getCirclePer (double a) {
        return 2 * 3.14 * a;
    }
}
