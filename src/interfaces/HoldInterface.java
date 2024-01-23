package interfaces;

import exceptions.DifferentPlacesException;
import people.Person;
import things.Thing;

public interface HoldInterface {
    void hold(Person person);
    void hold(Thing thing);
}
