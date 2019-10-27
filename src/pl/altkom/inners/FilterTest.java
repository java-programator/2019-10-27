package pl.altkom.inners;

import java.util.ArrayList;
import java.util.List;

class CheckIfHopper implements CheckTrait {

    @Override
    public boolean test(Animal a) {
        return a.isHopper();
    }
}

public class FilterTest {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        CheckTrait checkTrait1 = new CheckTrait() {
            @Override
            public boolean test(Animal a) {
                return false;
            }
        };
        CheckTrait checkTrait2 = new CheckTrait() {
            @Override
            public boolean test(Animal a) {
                return false;
            }
        };
        AnimalFilter.print(animals, new CheckTrait() {
            @Override
            public boolean test(Animal a) {
                return false;
            }
        });
    }
}

