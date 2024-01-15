package people;

import enumerations.*;
import exceptions.DifferentPlacesException;
import interfaces.*;
import things.*;

import java.util.ArrayList;
import java.util.Objects;

public class Person implements PutInterface, HoldInterface, MovementInterface {
    private Place place;
    private String name;
    private ArrayList<Emotion> EmotionalState;
    private int temperature;
    private ArrayList<Injury> injuries;
    private int BloodPressure;
    private Person PersonAtSight;
    private Thing ObjectAtSight;

    public Person(Place place, int temperature, String name, int bloodPressure) {
        this.place = place;
        this.temperature = temperature;
        this.name = name;
        this.BloodPressure = bloodPressure;
        this.injuries = new ArrayList<>();
        this.EmotionalState = new ArrayList<>();
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
    public Injury getInjuries(){
        return this.injuries.get(injuries.size() - 1);
    }
    public void setEmotionalState(Emotion emotionalState) {
        this.EmotionalState.add(emotionalState);
    }

    public Emotion getEmotionalState() {
        return this.EmotionalState.get(EmotionalState.size() - 1);
    }
    public Person getPersonAtSight() {
        return PersonAtSight;
    }

    public void lookAt(Person person) {
        this.PersonAtSight = person;
    }

    public String getObjectAtSight() {
        return ObjectAtSight.getClass().getName();
    }

    public void lookAt(Thing thing) {
        this.ObjectAtSight = thing;
        if((thing.getClass() == Coffin.class)){
            this.feel(Emotion.FEAR);
            this.feel(Emotion.DESPAIR);
            this.feel(Emotion.DISTURBANCE);
        }
    }

    public void think(String string) {
        System.out.printf("%n-%s", string);
    }

    public void sayTo(Person person, String string) {
        System.out.printf("%n-%s", string);
    }

    public void putDown(Thing thing, Place place) {
        thing.setPlace(place);
    }

    public void putDown(Person person, Place place) {
        person.place = place;
    }



    public void hold(Person person){
        try{
            if (this.getPlace() != person.getPlace()) {
                throw new DifferentPlacesException("Так нельзя!");
            }
        }
        catch (DifferentPlacesException e){
        System.out.printf("%n%s", e.getMessage());
        }
    }

    public void hold(Thing thing){
        try {
            if (thing.getClass() == Deck.class) {
                ((Deck) thing).injurePerson(this);
            }
            if (this.getPlace() != thing.getPlace()) {
                throw new DifferentPlacesException("Так нельзя!");
            }
        }
        catch (DifferentPlacesException e){
            System.out.printf("%n%s", e.getMessage());
        }
    }

    public void jump() {
        int chance = (int)(Math.random() * 10);
        if (chance == 7){
            setInjuries(Injury.SCRATCH);
        }
        if (Objects.equals(this.getName(), "Elly")){
            setInjuries(Injury.SCRATCH);
        }
    }

    public void feel(Emotion emotion) {
        setEmotionalState(emotion);
        if (emotion == Emotion.FEAR||emotion == Emotion.DISTURBANCE){
            setBloodPressure(10);
        }
    }

    public void laugh() {
        this.feel(Emotion.JOY);
    }

    public int getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        BloodPressure += bloodPressure;
    }
    public void sleep(){
        setBloodPressure(-(getBloodPressure() - 120));
    }

    public void stir(){feel(Emotion.DISCOMFORT);
    }
    public void showTo(Person person, Injury injury){
        System.out.printf("%n-%s", "Hey, look!");
    }
    public void showTo(Person person, Thing thing){
        System.out.printf("%n-%s", "Hey, look!");
    }
    public void remember(Scene scene){
        this.feel(Emotion.FEAR);
        this.feel(Emotion.DESPAIR);
        this.feel(Emotion.DISTURBANCE);
    }
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
    public void lookAround(){
        System.out.printf("%n-%s","Huh?");
    }
    public void clutch(Person gadge){
        gadge.stir();
    }
    public void putBlanketOver(Person gadge){gadge.setTemperature(37);}
    public void lightCoffinTops(){
        Coffin.CoffinTop.levelOfLighting = 30;
    }
    public Coffin createCoffin(Thing deck){
        this.hold(deck);
        return new Coffin(Place.EXHIBITION, 100, 9);
    }
    public Picture draw(Picture picture){
        Person drawnLouis = new Person(Place.GADGE_ROOM, 0, "Daddy", 0);
        Person drawnRachel = new Person(Place.GADGE_ROOM, 0, "Mommy", 0);
        Person drawnGadge = new Person(Place.GADGE_ROOM, 0, "Brother", 0);
        Person drawnElly = new Person(Place.GADGE_ROOM, 0, "Me", 0);
        picture.setContents(drawnLouis);
        picture.setContents(drawnRachel);
        picture.setContents(drawnGadge);
        picture.setContents(drawnElly);
        return picture;
    }
}
