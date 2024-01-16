package things;

import enumerations.Emotion;
import people.Person;

public class Entity {
    public void triggerLouis(Person louis){
        Entity trigger = new Entity(){
            private void makeTrigger() {
                louis.feel(Emotion.FEAR);
                louis.feel(Emotion.DESPAIR);
                louis.feel(Emotion.SURPRISE);
            }
            @Override
            public void triggerLouis(Person louis) {
                makeTrigger();
            }
        };
        trigger.triggerLouis(louis);
    }

}
