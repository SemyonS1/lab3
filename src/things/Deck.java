package things;

import enumerations.Injury;
import enumerations.Place;
import people.Person;

public class Deck extends Thing {
    public Deck(Place place, double weight){
        super(place, weight);
    }
    public void injurePerson(Person person){
            person.setInjuries(Injury.SCRATCH);
    }
}
