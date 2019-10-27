package pl.altkom.zad10_7;

public class EventMenager implements Observer{

    @Override
    public void stateChanged(Event event) {
        System.out.println("Fix: "+event.toString());
    }
}
