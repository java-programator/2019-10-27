package pl.altkom.zad10_7;

public class EventLogger implements Observer{

    public EventLogger(){
    }

    @Override
    public void stateChanged(Event event) {
        System.err.println("Log: " + event.toString());
    }
}
