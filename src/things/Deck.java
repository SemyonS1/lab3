package things;

import enumerations.Injury;
import enumerations.Place;
import people.Person;

public class Deck extends Thing {
    private Place place;
    private int quantity;
    private double weight;
    public Deck(Place place, int quantity, double weight){
        super(place, quantity, weight);
    }
    public void injurePerson(Person person){
        for (int i = 0; i < this.getQuantity(); i++)
            person.setInjuries(Injury.SCRATCH);
    }
}
