package people;

import enumerations.*;
import interfaces.*;
import things.*;

import java.util.ArrayList;

public class Person implements PutInterface, HoldInterface, MovementInterface {
    private Place place;
    private String name;
    private ArrayList<Emotion> EmotionalState;
    private int temperature;
    private ArrayList<Injury> injuries;

    public Person(Place place, int temperature, String name) {
        this.place = place;
        this.temperature = temperature;
        this.name = name;
        Heart heart = new Heart(120);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setInjuries(Injury injury){
        this.injuries.add(injury);
    }
    public Injury getInjuries(int index){
        return this.injuries.get(index);
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
        if ((this.EmotionalState.contains(Emotion.FEAR)) || (this.EmotionalState.contains(Emotion.DISTURBANCE))) {
            Heart.pumpBloodFaster();
        }
    }

    public void laugh() {
    }


    public void setEmotionalState(Emotion emotionalState) {
        this.EmotionalState.add(emotionalState);
    }

    public Emotion getEmotionalState() {
        return this.EmotionalState.get(-1);
    }
    public void sleep(){}
    public void stir(){feel(Emotion.DISCOMFORT);
    }
    public void showTo(Person person, Injury injury){}
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
