package com.example.demo.web;
import com.example.demo.model.Triangle;
import com.example.demo.serives.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000"})

@Controller
@ResponseBody
public class CalcController {
    @Autowired
    private TriangleCalcService triangleService;
    @Autowired
    private SquareCalcService squareCalcService;
    @Autowired
    private RhombusCalcService rhombusCalcService;
    @Autowired
    private TrapezoidCalcService trapezoidCalcService;
    @Autowired
    private RectangleCalcService rectangleCalcService;
    @Autowired
    private ParallelogramCalcService parallelogramCalcService;
    @Autowired
    private CircleCalcService circleCalcService;
    @Autowired
    private  RecTriangleCalcService recTriangleCalcService;

    @GetMapping("/triangle/square")
    public double getTriangleSquare(@RequestParam double a, @RequestParam double b) {
        return triangleService.getTriangleSquare(a, b);
    }

    @GetMapping("/triangle/per")
    public double getTrianglePer(@RequestParam double a, @RequestParam double b, @RequestParam double c) {
        return triangleService.getTrianglePer(a, b, c);
    }

    @GetMapping("/triangle/med")
    public double getTrianglemed(@RequestParam double a, @RequestParam double b, @RequestParam double c) {
        return triangleService.getTriangleMed(a, b, c);
    }

    @GetMapping("/triangle/bess")
    public double getTriangleBess(@RequestParam double a, @RequestParam double b, @RequestParam double c) {
        return triangleService.getTriangleBess(a, b, c);
    }
    @GetMapping("/triangle/type")
    public double getTriangleType(@RequestParam double a, @RequestParam double b, @RequestParam double c) {
        return triangleService.getTriangleType(a, b, c);
    }
    @GetMapping("/triangle/rad")
    public double getTriangleRad(@RequestParam double a, @RequestParam double b, @RequestParam double c) {
        return triangleService.getTriangleRad(a, b, c);
    }
    @GetMapping("/triangle/opi")
    public double getTriangleOpi(@RequestParam double a, @RequestParam double b, @RequestParam double c) {
        return triangleService.getTriangleOpi(a, b, c);
    }
    @GetMapping("/squared/square")
    public double getSquaredSquare(@RequestParam double a) {
        return squareCalcService.getSquaredSquare(a);
    };

    @GetMapping("/square/per")
    public double getSquaredPer(@RequestParam double a) {
        return squareCalcService.getSquaredPer(a);
    };

    @GetMapping("/square/radius")
    public double getSquaredRadius(@RequestParam double a) {
        return squareCalcService.getSquaredRadius(a);
    };

    @GetMapping("square/opi")
    public  double getSquaredOpi(@RequestParam double a) {
        return squareCalcService.getSquaredOpi(a);
    }

    @GetMapping("rhombus/square")
    public double getRhombusSquare(@RequestParam double a, @RequestParam double b) {
        return rhombusCalcService.getRhombusSquare(a, b);
    };

    @GetMapping("rhombus/per")
    public double getRhombusPer(@RequestParam double a) {
        return rhombusCalcService.getRhombusPer(a);
    }

    @GetMapping("trapezoid/square")
    public double getTrapezoidSquare(@RequestParam double a, @RequestParam double b, @RequestParam double c) {
        return trapezoidCalcService.getTrapezoidSquare(a, b, c);
    }
    @GetMapping("trapezoid/per")
    public double getTrapezoidPer(@RequestParam double a, @RequestParam double b, @RequestParam double c, @RequestParam double d) {
        return trapezoidCalcService.getTrapezoidPer(a, b, c, d);
    }

    @GetMapping("rectangle/square")
    public double getRectangleSquare(@RequestParam double a, @RequestParam double b) {
        return rectangleCalcService.getRectangleSquare(a, b);
    }
    @GetMapping("rectangle/per")
    public double getRectanglePer(@RequestParam double a, @RequestParam double b) {
        return rectangleCalcService.getRectanglePer(a, b);
    }
    @GetMapping("parallelogram/square")
    public double getParallelogramSquare(@RequestParam double a, @RequestParam double b) {
        return parallelogramCalcService.getParallelogramSquare(a, b);
    }
    @GetMapping("parallelogram/per")
    public double getParallelogramPer(@RequestParam double a, @RequestParam double b) {
        return parallelogramCalcService.getParallelogramPer(a, b);
    }
    @GetMapping("parallelogram/height")
    public double getParallelogramHeight(@RequestParam double a, @RequestParam double b) {
        return parallelogramCalcService.getParallelogramHeight(a, b);
    }
    @GetMapping("circle/square")
    public double getCircleSquare(@RequestParam double a) {
        return circleCalcService.getCircleSquare(a);
    }
    @GetMapping("circle/per")
    public double getCirclePer(@RequestParam double a) {
        return circleCalcService.getCirclePer(a);
    }
    @GetMapping("recTriangle/sin")
    public List<Double> getRecTriangleSin(@RequestParam double a, @RequestParam double b) {
        return recTriangleCalcService.getRecTriangleSin(a, b);
    }
    @GetMapping("recTriangle/cos")
    public List<Double> getRecTriangleCos(@RequestParam double a, @RequestParam double b) {
        return recTriangleCalcService.getRecTriangleCos(a, b);
    }
    @GetMapping("recTriangle/tg")
    public List<Double> getRecTriangleTg(@RequestParam double a, @RequestParam double b) {
        return recTriangleCalcService.getRecTriangleTg(a, b);
    }
    @GetMapping("recTriangle/gip")
    public double getRecTriangleGip(@RequestParam double a, @RequestParam double b, @RequestParam double c) {
        return recTriangleCalcService.getRecTriangleGip(a, b, c);
    }
}
