package pl.altkom.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample {

    public static void main(String[] args) {
        List<String> array = Arrays.asList(
                "Paweł Bogdan",
                "Jan Kowalski",
                "Eliza Orzeszkowa",
                "Maria Konopnicka"
        );

        // ======== zadanie 1 =========
        // wydrukuj wszystkie elementy listy
        Consumer<String> print = s -> System.out.println(s);
        array.forEach(print);

        // ======== zadanie 2 ==========
        // wydrukuj inicjaly
        Consumer<String> c1 = s -> System.out.print(s.charAt(0));
        Consumer<String> c2 = s -> System.out.print(s.split(" ")[1].charAt(0));
        Consumer<String> c3 = s -> System.out.print(", ");
        array.forEach(c1.andThen(c2).andThen(c3));


    }
}
