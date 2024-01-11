package people;

import enumerations.*;
import interfaces.*;
import things.Thing;

import java.util.Objects;

public class Person implements PutInterface, HoldInterface, MovementInterface {
    public Place place;
    private Emotion EmotionalState;
    protected Person(Place place){
        this.place = place;
    }
    public Person(){}
    public void lookAt(Person person){}
    public void think(String string) {System.out.printf("%n-%s", string);}
    public void sayTo(Person person, String string){
        System.out.printf("%n-%s", string);
    }
    public void putSmthDown(Thing thing, Place place){
        thing.place = place;
    }
    public void putSmnDown(Person person, Place place){
        person.place = place;
    }
    public void holdSmth(Thing thing){}
    public void holdSmn(Person person){}
    public void goTo(Place place){
        this.place = place;
    }
    public void jump(){}
    public void feel(Emotion emotion){
        setEmotionalState(emotion);
    }
    public void laugh(){}
    public void setPlace(Place place){
        this.place = place;
    }
    public void setEmotionalState(Emotion emotionalState){
        this.EmotionalState = emotionalState;
    }
    public Emotion getEmotionalState(){
        return this.EmotionalState;
    }

}
