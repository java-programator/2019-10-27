package pl.altkom.zad10_6;

import java.util.Iterator;

public class Group implements Iterable<Person>{
    public Person[] people;

    public Group() {
        people = new Person[3];
    }

    @Override
    public Iterator<Person> iterator() {
        return new Itr();
    }

    class Itr implements Iterator<Person> {
        int wskaznik = 0;

        @Override
        public boolean hasNext() {
            if (wskaznik < people.length) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Person next() {
            Person result = people[wskaznik];
            wskaznik++;
            return result;
        }
    }
}
