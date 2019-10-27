package pl.altkom.zad10_7;

public class Event {
    private String description;

    public Event(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Event{" +
                "description='" + description + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }
}
