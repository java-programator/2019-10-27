package pl.altkom.cwiczenia_lambda1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class cw3consumer {
    public static void main(String[] args) {
        List<String> array = Arrays.asList("jan nowak", "ela grela", "pies azor", "chleb bep");

        Consumer<String> print = s -> System.out.println(s);

        array.forEach(print);

        Consumer<String> print2 = s -> System.out.print(s.charAt(0));
        Consumer<String> print3 = s -> System.out.print(s.split(" ")[1].charAt(0));
        Consumer<String> print4 = s -> System.out.print(", ");
        array.forEach(print2.andThen(print3).andThen(print4));

    }
}
