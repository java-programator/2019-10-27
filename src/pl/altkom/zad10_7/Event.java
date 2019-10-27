package pl.altkom.zad10_7;

public class Event {
    private String description;

    public Event(String opis) {
        this.description = opis;
    }

    @Override
    public String toString() {
        return "Event{" +
                "opis='" + description + '\'' +
                '}';
    }

}
