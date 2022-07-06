package ru.job4j.tracker.oop;

import static java.lang.Math.sqrt;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public  Triangle(Point ab, Point bc, Point ac) {
        this.first = ab;
        this.second = ac;
        this.third = bc;
    }

    public  double semiperimetr(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public boolean exist(double ab, double ac, double bc) {
        return (ab + ac) > bc && (ab + bc) > ac && (bc + ac) > ab;
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = second.distance(third);
        double bc = first.distance(third);
        if (this.exist(ab, ac, bc)) {
            double p = semiperimetr(ab, ac, bc);
            rsl = sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }
}
