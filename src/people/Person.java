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
    private final ArrayList<Emotion> EmotionalState;
    private int temperature;
    private final ArrayList<Injury> injuries;
    private int bloodPressure;
    private Person personAtSight;
    private Thing objectAtSight;

    public Person(Place place, int temperature, String name, int bloodPressure) {
        this.place = place;
        this.temperature = temperature;
        this.name = name;
        this.bloodPressure = bloodPressure;
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
        return personAtSight;
    }

    public void lookAt(Person person) {
        this.personAtSight = person;
    }

    public String getObjectAtSight() {
        return objectAtSight.getClass().getName();
    }

    public void lookAt(Thing thing) {
        this.objectAtSight = thing;
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
        person.feel(Emotion.INTEREST);
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
    public void rename(Person person){
        person.setName("Gadge");
        System.out.printf("%n%s", "That's much better");
        person.setPlace(Place.WINDOWSILL);
        System.out.print(", stay here");
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
        return bloodPressure;
    }

    public void setBloodPressure(int bloodpressure) {
        bloodPressure += bloodpressure;
    }
    public void sleep(){
        setBloodPressure(-(getBloodPressure() - 120));
    }

    public void stir(){feel(Emotion.DISCOMFORT);
    }
    public void showTo(Person person, Injury injury){
        System.out.printf("%n-%s", "Hey, look! It's a " + injury);
        this.feel(Emotion.INTEREST);
        person.feel(Emotion.INTEREST);
    }
    public void showTo(Person person, Thing thing){
        System.out.printf("%n-%s", "Hey, look! It's a " + thing.getClass().getSimpleName());
        person.feel(Emotion.INTEREST);
    }
    public void remember(Scene scene){
        if (scene.getContents().getClass() == Coffin.class) {
            this.feel(Emotion.FEAR);
            this.feel(Emotion.DESPAIR);
            this.feel(Emotion.DISTURBANCE);
        }
    }
    public void kissSmn(Person person){
        System.out.printf("%n%s", "*kiss noise*");
        person.feel(Emotion.JOY);
    }
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
        Place.EXHIBITION.setLeveloflighting(30);
        System.out.printf("%n%s", Place.EXHIBITION.getLeveloflighting() + " - Looks good to me");
    }
    public ArrayList<Coffin> createCoffin(ArrayList<Deck> deck) {
        for (int i = 0; i < 1000; i++) {
            this.hold(deck.get(i));
        }
        ArrayList<Coffin> coffins = new ArrayList<>();
        for (int j = 0; j < 100; j += 10){
            Coffin coff = new Coffin(Place.EXHIBITION, 0);
            coff.setWeight(9);
            coffins.add(coff);
        }
        System.out.printf("%n%s", coffins.get(1).getWeight() + " - Thats's a heavy one!");
        return coffins;
    }
    public Coffin iForgor(){
        System.out.printf("%n%s", "Almost forgot one!");
        return new Coffin(Place.EXHIBITION, 9);
    }
    public void rename(Cat cat){
        cat.setName("Church");
        System.out.println(cat.getName() + " good boy");
    }
    public Picture draw(Picture picture) {
        DrawnPerson drawnLouis = new DrawnPerson(Place.GADGE_ROOM, 0, "Daddy", 0, "Red");
        DrawnPerson drawnRachel = new DrawnPerson(Place.GADGE_ROOM, 0, "Mommy", 0, "Yellow");
        DrawnPerson drawnGadge = new DrawnPerson(Place.GADGE_ROOM, 0, "Brother", 0, "Blue");
        DrawnPerson drawnElly = new DrawnPerson(Place.GADGE_ROOM, 0, "Me", 0, "Pink");
        picture.setContents(drawnLouis);
        drawnGadge.setColour("Green");
        picture.setContents(drawnRachel);
        picture.setContents(drawnGadge);
        picture.setContents(drawnElly);
        for (int i = 0; i < 4; i++) {
            System.out.printf("%n%s", ((DrawnPerson) picture.getContents(i)).getColour() + " - What a nice colour!");
        }
        return picture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getTemperature() == person.getTemperature() && getBloodPressure() == person.getBloodPressure() && getPlace() == person.getPlace() && Objects.equals(getName(), person.getName()) && Objects.equals(getEmotionalState(), person.getEmotionalState()) && Objects.equals(getInjuries(), person.getInjuries()) && Objects.equals(getPersonAtSight(), person.getPersonAtSight()) && Objects.equals(getObjectAtSight(), person.getObjectAtSight());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlace(), getName(), getEmotionalState(), getTemperature(), getInjuries(), getBloodPressure(), getPersonAtSight(), getObjectAtSight());
    }

    @Override
    public String toString() {
        return "Person{" +
                "place=" + place +
                ", name='" + name + '\'' +
                ", EmotionalState=" + EmotionalState +
                ", temperature=" + temperature +
                ", injuries=" + injuries +
                ", BloodPressure=" + bloodPressure +
                ", PersonAtSight=" + personAtSight +
                ", ObjectAtSight=" + objectAtSight +
                '}';
    }
}
