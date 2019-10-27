package pl.altkom.inners;

import java.util.function.IntUnaryOperator;

public class Example05 {
    public static void main(String[] args) {
        int z = 5;
        int x = 3 * z;
        z += 6;
        IntUnaryOperator f = y -> x + y;
    }
}
