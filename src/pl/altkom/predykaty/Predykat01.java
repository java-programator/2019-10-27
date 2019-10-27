package pl.altkom.predykaty;

import java.util.function.Predicate;

public class Predykat01 {
    public static void main(String[] args) {
        Predicate<Integer> divisibleBy5 = x -> x % 5 == 0;
        Predicate<Integer> divisibleBy7 = x -> x % 7 == 0;

        Predicate<Integer> zadanie = divisibleBy5.and(divisibleBy7);
        Predicate<Integer> zadanie01 =
                x -> (x % 5 == 0) && (x % 7 == 0);
        Predicate<Integer> zadanie02 =
                x -> divisibleBy5.test(x) && divisibleBy7.test(x);

        boolean z = zadanie.test(70);
        System.out.println(z);
    }
}
