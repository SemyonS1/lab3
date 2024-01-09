package people;

import enumerations.*;
import interfaces.*;
import things.Thing;

import java.util.Objects;

public class Person implements PutInterface, HoldInterface, MovementInterface {
    public Place place;
    protected String name;
    public Person(Place place, String name){
        this.place = place;
        this.name = name;
    }
    public void lookAt(Person person){}
    public void think(String s) {System.out.printf("%n-%s", s);}
    public void sayTo(Person p, String s){
        System.out.printf("%n-%s", s);
    }
    public void putSmthDown(Thing thing, Place place){
        thing.place = place;
    }
    public void putSmnDown(Person person, Place place){
        person.place = place;
    }
    public void holdSmth(Thing thing){}
    public void holdSmn(Person person){}
    public void goTo(Place place){
        this.place = place;
    }
    public void jump(){}
    public boolean feel(Emotion emotion){
        return true;
    }
    public void laugh(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return place == person.place && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(place, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "place=" + place +
                ", name='" + name + '\'' +
                '}';
    }
}
