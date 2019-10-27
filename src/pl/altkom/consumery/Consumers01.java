package pl.altkom.consumery;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumers01 {
    public static void main(String[] args) {
        List<String> array = Arrays.asList(
                "Paweł Bogdan",
                "Jan Kowalski",
                "Eliza Orzeszkowa",
                "Maria Konopnicka"
        );
        Consumer<String> c1 = s -> System.out.println(s);
        array.forEach(c1);



        Consumer<String> c2 = s -> System.out.print(s.charAt(0));
        Consumer<String> c3 = s -> System.out.print(s.split(" ")[1].charAt(0));
        Consumer<String> c4 = s -> System.out.print(", ");

        Consumer<String> c5 = s -> {
            int index = s.indexOf(" ");
            String l1 = String.valueOf(s.charAt(0));
            String l2 = String.valueOf(s.charAt(index+1));
            System.out.printf("%s%s, ", l1, l2);
        };

        Consumer<String> c6 = s -> {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (Character.isUpperCase(s.charAt(i))) {
                    sb.append(s.charAt(i));
                }
            }
            System.out.println(sb.toString());
        };

        array.forEach(c2.andThen(c3.andThen(c4)));
    }
}
