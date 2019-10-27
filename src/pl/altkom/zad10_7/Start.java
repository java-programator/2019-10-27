package pl.altkom.zad10_7;

public class Start {
    public static void main(String[] args) {

        FireWall f = new FireWall();
        Observer o1 = new EventLogger();
        Observer o2 = new EventManager();

        f.attach(o1);
        f.attach(o2);

        Event e1 = f.generateEvent("hahaha");

        f.notifyObservers(e1);

    }
}
