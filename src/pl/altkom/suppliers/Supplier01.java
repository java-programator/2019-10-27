package pl.altkom.suppliers;

import java.util.Scanner;
import java.util.function.Supplier;

public class Supplier01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Supplier<String> read = () -> sc.next();

        while (true) {
            System.out.println(read.get());
        }

    }
}
