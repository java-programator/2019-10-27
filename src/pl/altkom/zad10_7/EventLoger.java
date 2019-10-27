package pl.altkom.zad10_7;

public class EventLoger implements Observer {
    @Override
    public void stateChanged(Event event) {
        System.err.println("Log: " + event.toString());
    }
}
