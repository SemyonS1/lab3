package things;

import enumerations.Emotion;
import people.Louis;

public class Entity {
    public void triggerLouis(Louis louis){
        louis.feel(Emotion.FEAR);
        louis.feel(Emotion.DESPAIR);
        louis.feel(Emotion.SURPRISE);
    }

}
