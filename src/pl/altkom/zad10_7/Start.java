package pl.altkom.zad10_7;

public class Start {
    public static void main(String[] args) {
        FireWall f = FireWall.getInstance();

        Observer o1 = new EventLogger();
        Observer o2 = new EventMenager();

        f.attach(o1);
        f.attach(o2);

        Event e1 = f.generateEvent("lalala");
        f.notifyObservers(e1);
    }
}
