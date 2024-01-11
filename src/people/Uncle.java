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
    public Coffin createCoffin(Thing deck){
        return new Coffin(Place.EXHIBITION, 100);
    }
}
