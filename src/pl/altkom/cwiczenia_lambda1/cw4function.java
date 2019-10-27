package pl.altkom.cwiczenia_lambda1;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.function.Function;

public class cw4function {
    public static double integrate(Function<Double, Double> f, double a, double b){
        double dx = (b-a)/100;
        double result = 0;
        for(double x = a; x <=b; x += dx){
            double fx = f.apply(x);
            double area = fx*dx;
            result += area;
        }
        return result;

    }

    public static void main(String[] args) {
        Function<Double, Double> f = x -> Math.sin(x);
        System.out.println(integrate(f, 0,Math.PI));
    }


}
