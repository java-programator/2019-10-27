package pl.altkom.funkcje;

import java.util.function.Function;
import java.util.function.ToLongFunction;

public class Function02 {
    public static void main(String[] args) {
        Function<String, Long> f1 = s -> Long.valueOf(s.length());
        ToLongFunction<String> f2 = s -> s.length();

    }
}
