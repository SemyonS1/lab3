package interfaces;

import people.Person;
import things.Thing;

@SuppressWarnings("unused")
public interface HoldInterface {
    void hold(Person person);
    void hold(Thing thing);
}
