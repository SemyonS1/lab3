package things;

import enumerations.Place;

public class Thing {
    public Place place;
    public int quantity;
    public Thing(Place place, int quantity){
        this.place = place;
        this.quantity = quantity;
    }
}
