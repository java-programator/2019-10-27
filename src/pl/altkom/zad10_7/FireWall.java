package pl.altkom.zad10_7;

import java.util.HashSet;
import java.util.Set;

public class FireWall implements Subject {

    Set<Observer> observers = new HashSet<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(Event e){
        for (Observer o: observers){
            o.stateChanged(e);
        }
    }

    public Event generateEvent(String desc) {
        Event e = new Event(desc);
        return e;
    }


}
