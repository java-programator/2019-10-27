package pl.altkom.funkcje;

import java.util.function.Function;

public class Functions01 {
    public static double integrate(Function<Double, Double> f, double a, double b) {
        double dx = (b - a) / 100;
        double result = 0;
        for (double x = a; x <= b; x += dx) {
            double fodx = f.apply(x);
            double area = fodx * dx;
            result += area;
        }
        return result;
    }

    public static void main(String[] args) {
        Function<Double, Double> f = x -> Math.sin(x);
        System.out.println(integrate(f, 0, 2*Math.PI));
    }

}
