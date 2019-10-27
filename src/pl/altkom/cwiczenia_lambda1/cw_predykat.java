package pl.altkom.cwiczenia_lambda1;

import java.util.function.Predicate;

public class cw_predykat {
    public static void main(String[] args) {
        Predicate<Integer> divisibleby5 = x ->x%5 == 0;
        Predicate<Integer> divisibleby7 = x ->x%7 == 0;
        Predicate<Integer> divisibleby57 = x -> (x%5==0) && (x%7==0);

        boolean z = divisibleby57.test(35);
        System.out.println(z);
    }
}
