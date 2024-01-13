package people;

import enumerations.Place;
import things.Coffin;
import things.Thing;

public class Uncle extends Person{
    public Uncle(Place place){
        super(place);
    }
    public void lightCoffinTops(){
        Coffin.CoffinTop.levelOfLighting = 30;
    }
    public Coffin createCoffin(Thing wood){
        Thing deck = new Thing(1){
            public void setWeight(Thing wood){
                wood.weight /= 1000;
            }
        };
        deck.setWeight(1000);
        return new Coffin(Place.EXHIBITION, 100, 9);
    }
}
