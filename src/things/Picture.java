package things;

import enumerations.Place;
import people.Person;

public class Picture extends Thing{
    private Person contents;
    public Picture(Place place, int quantity, double weight){
        super(place, quantity, weight);
    }
    public void setContents(Person person){
        this.contents = person;
    }
}
