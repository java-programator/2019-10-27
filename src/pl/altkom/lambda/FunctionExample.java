package pl.altkom.lambda;

import java.util.function.Function;

public class FunctionExample {

    public static double integrate(Function<Double, Double> f, double a, double b){
        double dx = (b - a) / 100;

        double result = 0;

        for(double x = a; x <= b; x += dx){
            double fx = f.apply(x);
            double area = fx * dx;
            result += area;
        }

        return result;
    }

    public static void main(String[] args) {
        // ======== zadanie 1 =======
        // oblicz calke dla przedziału:
        Function<Double, Double> f1 = x -> Math.sin(x);
        System.out.println(integrate(f1, 0, Math.PI));


    }
}
