package pl.altkom.zad10_7;

public class Event {

    private String komunikat;

    public Event(String komunikat){
        this.komunikat = komunikat;
    }

    @Override
    public String toString() {
        return "Event{" +
                "komunikat='" + komunikat + '\'' +
                '}';
    }
}
