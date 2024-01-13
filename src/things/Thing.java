package things;

import enumerations.Place;

public class Thing {
    public Place place;
    public int quantity;
    public int weight;
    protected Thing(Place place, int quantity, int weight){
        this.place = place;
        this.quantity = quantity;
        this.weight = weight;
    }

    public Thing() {

    }

    public void setPlace(Place place){
        this.place = place;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    protected Thing(int weight) {
        this.weight = weight;
    }
}
