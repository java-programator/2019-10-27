package pl.altkom;

import java.util.function.Predicate;

public class Predykat02 {
    public static void main(String[] args) {
        Predicate<Integer> d4 = x -> x % 4 == 0;
        Predicate<Integer> d100 = x -> x % 100 == 0;
        Predicate<Integer> d400 = x -> x % 400 == 0;

        Predicate<Integer> isLeap;
    }
}
