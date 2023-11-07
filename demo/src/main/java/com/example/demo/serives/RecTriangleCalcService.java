package com.example.demo.serives;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecTriangleCalcService {
    public static List<Double> getRecTriangleSin(double a, double b) {
        double sina = a / b;
        double sinr = Math.sin(a / b);
        return List.of(sina, sinr);
    }
    public static List<Double> getRecTriangleCos(double a, double b) {
        double cosa = a / b;
        double cosr = Math.cos(a / b);
        return List.of(cosa, cosr);
    }
    public static List<Double> getRecTriangleTg(double a, double b) {
        double tga = a / b;
        double tgr = Math.tan(a / b);
        return List.of(tga, tgr);
    }
    public double getRecTriangleGip(double a, double b, double c) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(c)));
    }
}
