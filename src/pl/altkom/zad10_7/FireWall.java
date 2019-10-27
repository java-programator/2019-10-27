package pl.altkom.zad10_7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FireWall implements Subject{


    //List<Observer> observerList;
    List<Observer> observerList = new ArrayList<>();

    //public FireWall(){
    //    observerList = new ArrayList<>();
    //}

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    void notifyObservers(Event e){
        for(Observer o : observerList){
            o.stateChanged(e);
        }
    }

    Event generateEvent(String desc){
        Event e = new Event(desc);
        return e;
    }
}
