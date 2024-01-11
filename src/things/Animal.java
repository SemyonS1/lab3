package things;

import enumerations.Species;
import people.Person;

abstract class Animal {
    Species species;
    String name;
    protected Animal(Species species, String name){
        this.species = species;
        this.name = name;
    }
    public abstract void interactW(Person person);
}
