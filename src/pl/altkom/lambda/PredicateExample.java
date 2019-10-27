package pl.altkom.lambda;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        // ======== zadanie 1 =======

        Predicate<Integer> przez7 = x -> x%7 == 0;
        Predicate<Integer> przez5 = x -> x%5 == 0;
        Predicate<Integer> prze5i7 = przez7.and(przez5);

        Predicate<Integer> zadanie1 = x -> przez5.test(x) && przez7.test(x);

        boolean test1 = prze5i7.test(35);
        boolean test2 = prze5i7.test(34);

        boolean zad1 = zadanie1.test(70);

        System.out.println(test1);
        System.out.println(test2);

        //  ======== zadanie 2 ======

        Predicate<Integer> d4 = x -> x%4 == 0;
        Predicate<Integer> d100 = x -> x%100 == 0;
        Predicate<Integer> d400 = x -> x%400 == 0;

        // rozwiązanie z zajęć
        Predicate<Integer> h1 = d4.and(d100.negate());
        Predicate<Integer> h2 = d100.and(d400);

        // moje rozwiązanie
        Predicate<Integer> isLeap = (d4.and(d100).and(d400)).or((d4.and(d100.negate())));

        boolean testY1 = isLeap.test(1900);
        boolean testY2 = isLeap.test(1996);
        boolean testY3 = isLeap.test(2000);

        System.out.println("Czy rok jest przestępny: " + testY1);
        System.out.println("Czy rok jest przestępny: " + testY2);
        System.out.println("Czy rok jest przestępny: " + testY3);
    }
}
