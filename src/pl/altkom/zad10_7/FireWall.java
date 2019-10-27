package pl.altkom.zad10_7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FireWall implements Subject{

    private static FireWall instance;

    private FireWall(){
    }

    public static FireWall getInstance(){
        if(instance == null){
            instance = new FireWall();
        }
        return instance;
    }

    List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public Event generateEvent(String opis){
        Event event = new Event(opis);
        return event;
    }

    public void notifyObservers(Event e){
        for(Observer o: observers){
            o.stateChanged(e);
        }
    }
}
