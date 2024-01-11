package things;

import enumerations.Place;

public class Thing {
    public Place place;
    public int quantity;
    protected Thing(Place place, int quantity){
        this.place = place;
        this.quantity = quantity;
    }
    public void setPlace(Place place){
        this.place = place;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public Thing() {
    }
}
