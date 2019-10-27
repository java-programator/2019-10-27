package pl.altkom.cwiczenia_lambda1;

import java.util.function.Predicate;

public class cw2predykat {
    public static void main(String[] args) {
        Predicate<Integer> d4 = x -> x%4 == 0;
        Predicate<Integer> d100 = x -> x%100 == 0;
        Predicate<Integer> d400 = x -> x%400 == 0;

        Predicate<Integer> isLeap = d4.and(d100.negate()).or(d100.and(d400));

        boolean rok = isLeap.test(2020);
        System.out.println(rok);
    }
}
