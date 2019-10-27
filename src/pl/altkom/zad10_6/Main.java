package pl.altkom.zad10_6;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Group g = new Group();
        g.people[0] = new Person("Jan", "Kowalski");
        g.people[1] = new Person("Anna", "Nowak");
        g.people[2] = new Person("Emilia", "Plater");

        Iterator<Person> it = g.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
