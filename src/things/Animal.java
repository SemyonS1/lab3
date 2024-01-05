package things;

import enumerations.Species;
import people.Person;

abstract class Animal {
    Species species;
    String name;
    public Animal(Species species, String name){
        this.species = species;
        this.name = name;
    }
    public void interactW(Person person){}
}
