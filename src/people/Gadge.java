package people;

import enumerations.*;


public class Gadge extends Person {
    public Gadge(Place place){
        super(place);
    }
    public void sleep(){}
    public void stir(){feel(Emotion.DISCOMFORT);
    }
}
