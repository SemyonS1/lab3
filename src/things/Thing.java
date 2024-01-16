package things;

import enumerations.Place;
import people.Person;

public abstract class Thing {
    private Place place;
    private int quantity;
    private double weight;

    public Thing(Place place, int quantity, double weight) {
        this.place = place;
        this.quantity = quantity;
        this.weight = weight;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public Place getPlace() {
        return place;
    }

    public double getWeight() {
        return weight;
    }
    public abstract void injurePerson(Person person);
}
