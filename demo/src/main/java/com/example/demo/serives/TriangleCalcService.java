package com.example.demo.serives;

import org.springframework.stereotype.Service;

@Service
public class TriangleCalcService {
   public double getTriangleSquare(double a, double b) {
       return (a * b) / 2;
   }
    public double getTrianglePer(double a, double b, double c) {
        return a + b + c;
    }
    public double getTriangleMed(double a, double b, double c) {
        return Math.sqrt(2 * a * a + 2 * b * b - c * c) * 0.5;
    }
    public double getTriangleBess(double a, double b, double c) {
        if((a + b) <= c) {
            throw new IllegalArgumentException("Неправильные данные");
        } else {
            return Math.sqrt(a * b * (a + b + c) * (a + b - c)) / (a + b);
        }
    }
    public double getTriangleType(double a, double b, double c) {
        if((a + b + c) != 180 || (a + b + c) > 180 || (a + b + c) < 180) {
            int codeType = 1; // Не бывает треугольнка
            return codeType;
            // throw new IllegalArgumentException("Неправильные данные");
        } else if (a == b && b == c) {
            int codeType = 2; // Равносторонний
            return codeType;
        } else if ( a == b && c == 90 || a == c && b == 90 || b == c && a == 90) {
            int codeType = 3; // Равнобедренный, прямоугольный
            return codeType;
        } else if ( a == b && c < 90 || a == c && b < 90 || b == c && a < 90) {
            int codeType = 4; // Равнобедренный, остроугольный
            return  codeType;
        } else if (  a == b && c > 90 || a == c && b > 90 || b == c && a > 90) {
            int codeType = 5; // Равнобедренный, тупоугольный
            return codeType;
        } else if ( a == b || b == c || c == a ) {
            int codeType = 6; // Равнобедренный
            return codeType;
        } else if ( a == 90 || b == 90 || c == 90) {
            int codeType = 7; // Прямоугольный, разносторонний
            return codeType;
        } else if ( a > 90 && a < 180 || b > 90 && b < 180 || c > 90 && c < 180 ) {
            int codeType = 8; // Тупоугольный, разносторонний
            return  codeType;
        } else if ( a < 90 && b < 90 && c < 90 ) {
            int codeType = 9; // Остроугольный, разносторонний
            return codeType;
        } else {
            int codeType = 10; // Разносторониий
            return codeType;
        }
    }
    public double getTriangleRad(double a, double b, double c) {
       if((a + b) > c && (a + c) > b && (b + c) > a) {
           return  ((b / 2 + c / 2 - a / 2) * (a / 2 + c / 2 - b / 2) * (a / 2 + b / 2 - c / 2)) / (a / 2 + b / 2 + c / 2) * 3.14;
       } else {
           int codeType = 0;
           return  codeType;
       }
    }
    public double getTriangleOpi(double a, double b, double c) {
       if( (a + b) > c && (a + c) > b && (b + c) > a) {
           return 3.14 * (a * a * b * b * c * c) / (16 * ( a / 2 + b / 2 + c / 2) * ((b / 2 + c / 2 - a / 2) * (a / 2 + c / 2 - b / 2) * (a / 2 + b / 2 - c / 2)));
       } else {
           int codeType = 0;
           return codeType;
       }
    }
}

