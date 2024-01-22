package things;

import enumerations.Emotion;
import people.Person;

public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }
    public void interactW(Person person){
        System.out.printf("%nmeow");
        person.feel(Emotion.JOY);
    }
}
