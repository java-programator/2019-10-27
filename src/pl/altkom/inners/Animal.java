package pl.altkom.inners;

public class Animal {
    private String species;
    private boolean hopper;
    private boolean swimmer;

    public Animal(String species, boolean hopper, boolean swimmer) {
        this.species = species;
        this.hopper = hopper;
        this.swimmer = swimmer;
    }

    public boolean isHopper() {
        return hopper;
    }

    public boolean isSwimmer() {
        return swimmer;
    }

    public String toString() {
        return species;
    }
}