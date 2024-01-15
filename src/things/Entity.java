package things;

import enumerations.Emotion;
import people.Person;

public class Entity {
    public void triggerLouis(Person louis){
        louis.feel(Emotion.FEAR);
        louis.feel(Emotion.DESPAIR);
        louis.feel(Emotion.SURPRISE);
    }

}
