package pl.altkom.zad10_7;

import java.util.Stack;

public class EventLogger implements Observer {


    @Override
    public void stateChanged(Event e) {
        System.err.println("changed: " + e.getDescription());
    }
}
