package things;

import enumerations.Species;
import people.Person;

public class Church extends Animal {
    public Church(Species species, String name){
        super(species, name);
    }
    public void interactW(Person person){
        System.out.printf("%nmeow");
    }
}
