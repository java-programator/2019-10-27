package pl.altkom.zad10_7;

public class EventManager implements Observer {
    @Override
    public void stateChanged(Event e) {
        System.out.println("fix: " + e.getDescription());
    }
}
