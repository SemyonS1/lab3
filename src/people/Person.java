package people;

import enumerations.*;
import interfaces.*;
import things.Thing;

public class Person implements PutInterface, HoldInterface, MovementInterface {
    public Place place;
    private Emotion EmotionalState;

    protected Person(Place place) {
        this.place = place;
        Heart heart = new Heart(120);
    }

    public Person() {
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

    public void holdSmth(Thing thing) {
        if (thing.weight > 3) {
            class Friction {
                public void causeDiscomfort() {
                    thing.weight *= 2;
                }
            }
            Friction fr = new Friction();
            fr.causeDiscomfort();
        }
    }

    public void holdSmn(Person person) {
    }

    public void goTo(Place place) {
        this.place = place;
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

}
