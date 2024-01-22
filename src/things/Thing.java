package things;

import enumerations.Place;

public abstract class Thing {
    private Place place;
    private double weight;

    public Thing(Place place, double weight) {
        this.place = place;
        this.weight = weight;
    }

    public void setPlace(Place place) {
        this.place = place;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Place getPlace() {
        return place;
    }

    public double getWeight() {
        return weight;
    }
}
