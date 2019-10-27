package pl.altkom.zad10_7;

public class Start {

    public static void main(String[] args) {
        FireWall f = new FireWall();
        Observer obs1 = new EventLogger();
        Observer obs2 = new EventManager();

        f.attach(obs1);
        f.attach(obs2);

        Event e1 = f.generateEvent("hahahha");
        f.notifyObservers(e1);
    }
}
