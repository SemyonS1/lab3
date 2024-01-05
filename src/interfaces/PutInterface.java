package interfaces;

import enumerations.Place;
import people.Gadge;
import people.Person;
import things.Thing;

public interface PutInterface {
    void putSmthDown(Thing thing, Place place);
    void putSmnDown(Person person, Place place);

}
