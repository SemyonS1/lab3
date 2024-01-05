package people;

import enumerations.Place;
import things.Scene;

public class Louis extends Person{
    protected int temperature;
    public Louis(Place place, String name, int temperature){
        super(place, name);
        this.temperature = temperature;
    }
    public void remember(Scene scene){}
    public void kissSmn(Person person){}
    public void goTo(Place place){
        if (place == Place.LADDER){
            this.temperature += 1;
        }
        else{
            this.temperature = 36;
        }
    }
    public void lookAround(){}
    public void clutch(Gadge gadge){
        gadge.stir();
    }
    public void putBlanketOver(Gadge gadge){}
}
