package pl.altkom.inners;

import java.util.List;

public class AnimalFilter {
    public static void print(List<Animal> animals,
                             CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) {
                System.out.print(animal + " ");
            }
        }
        System.out.println();
    }
}