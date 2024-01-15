package people;

import enumerations.*;
import interfaces.*;
import things.Coffin;
import things.Scene;
import things.Thing;

public class Person implements PutInterface, HoldInterface, MovementInterface {
    private Place place;
    private Emotion EmotionalState;
    private int temperature;

    public Person(Place place, int temperature) {
        this.place = place;
        this.temperature = temperature;
        Heart heart = new Heart(120);
    }

    private static class Heart {
        private static int BloodPumpingSpeed;

        protected Heart(int BloodPumpingSpeed) {
        }

        private static void pumpBloodFaster() {
            Heart.BloodPumpingSpeed = Heart.BloodPumpingSpeed + 60;
        }
    }

    public void lookAt(Person person) {
    }

    public void think(String string) {
        System.out.printf("%n-%s", string);
    }

    public void sayTo(Person person, String string) {
        System.out.printf("%n-%s", string);
    }

    public void putSmthDown(Thing thing, Place place) {
        thing.place = place;
    }

    public void putSmnDown(Person person, Place place) {
        person.place = place;
    }



    public void holdSmn(Person person) {
    }


    public void jump() {
    }

    public void feel(Emotion emotion) {
        setEmotionalState(emotion);
        if ((this.EmotionalState == Emotion.FEAR) || (this.EmotionalState == Emotion.DISTURBANCE)) {
            Heart.pumpBloodFaster();
        }
    }

    public void laugh() {
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public void setEmotionalState(Emotion emotionalState) {
        this.EmotionalState = emotionalState;
    }

    public Emotion getEmotionalState() {
        return this.EmotionalState;
    }
    public void sleep(){}
    public void stir(){feel(Emotion.DISCOMFORT);
    }
    public void showSmthTo(Person person, EllyShow thing){}
    public void remember(Scene scene){}
    public void kissSmn(Person person){}
    public void goTo(Place place){
        this.place = place;
        if (place == Place.LADDER){
            this.temperature += 1;
        }
        else{
            this.temperature = 36;
        }
    }
    public void lookAround(){}
    public void clutch(Person gadge){
        gadge.stir();
    }
    public void putBlanketOver(Person gadge){}
    public void lightCoffinTops(){
        Coffin.CoffinTop.levelOfLighting = 30;
    }
    public Coffin createCoffin(Thing wood){
        Thing deck = new Thing(1){
            public void setWeight(Thing wood){
                wood.weight /= 1000;
            }
        };
        deck.setWeight(1000);
        return new Coffin(Place.EXHIBITION, 100, 9);
    }

}
