package interfaces;

import enumerations.Place;
import people.Person;
import things.Thing;

@SuppressWarnings("unused")
public interface PutInterface {
    void putDown(Thing thing, Place place);
    void putDown(Person person, Place place);

}
