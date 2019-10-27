package pl.altkom.predykaty;

import java.util.function.Predicate;

public class Predykat02 {
    public static void main(String[] args) {
        Predicate<Integer> d4 = x -> x % 4 == 0;
        Predicate<Integer> d100 = x -> x % 100 == 0;
        Predicate<Integer> d400 = x -> x % 400 == 0;

        Predicate<Integer> h1 = d4.and(d100.negate());
        Predicate<Integer> h2 = d100.and(d400);

        Predicate<Integer> hardWay = (d4.and(d100.negate())).or(d100.and(d400));
        Predicate<Integer> isLeap = h1.or(h2);
    }
}
