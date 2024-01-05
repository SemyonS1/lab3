package people;

import enumerations.EllyShow;
import enumerations.Place;
import things.Thing;

public class Elly extends Person{
    public Elly(Place place, String name){
            super(place, name);
    }
    public void showSmthTo(Person person, EllyShow thing){}
}
