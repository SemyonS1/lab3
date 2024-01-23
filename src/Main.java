import people.*;
import things.*;
import enumerations.*;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Person louis = new Person(Place.WINDOWSILL, 36, "Louis", 120);
        Person gadge = new Person(Place.HALL, 36, "Semyon", 120);
        Person rachel = new Person(Place.HALL, 36, "Rachel", 120);
        Person elly = new Person(Place.WINDOWSILL, 36, "Elly", 120);
        Door door = new Door(Place.ENTRANCE, 5, DoorState.CLOSED);
        GadgeBed gadgeBed = new GadgeBed(Place.GADGE_ROOM, 4.5);
        Cat church = new Cat("Bob");
        Person uncle = new Person(Place.EXHIBITION, 36, "Uncle", 120);
        ArrayList<Deck> deck = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Deck d = new Deck(Place.EXHIBITION, 1);
            deck.add(d);
        }
        louis.rename(church);
        louis.rename(gadge);
        Picture picture = new Picture(Place.HALL, 0.1);
        ArrayList<Coffin> coffins = uncle.createCoffin(deck);
        uncle.lightCoffinTops();
        Scene scene = new Scene(coffins);
        Coffin lastone = uncle.iForgor();
        scene.setContents(lastone);




        elly.jump();
        elly.goTo(Place.HALL);
        rachel.lookAt(louis);
        Picture finishedPicture = elly.draw(picture);
        elly.hold(finishedPicture);
        louis.lookAt(gadge);
        louis.hold(louis.getPersonAtSight());
        gadge.feel(Emotion.SLEEPY);
        gadge.sleep();
        gadge.lookAt(rachel);
        rachel.feel(Emotion.DESPAIR);
        if (rachel.getEmotionalState() == Emotion.DESPAIR) {
            louis.feel(Emotion.FEAR);
            louis.think("We're really going to get old. It's really true. No one's going to make an exception for us. She's on her way … and so are we.");
        }
        louis.lookAt(elly);
        elly.lookAt(louis);
        elly.goTo(Place.WINDOWSILL);
        elly.showTo(elly.getPersonAtSight(), elly.getInjuries());
        elly.showTo(elly.getPersonAtSight(), finishedPicture);
        elly.sayTo(louis, "Old MacDonald and Mrs Berryman!");
        church.interactW(elly);
        louis.sayTo(louis.getPersonAtSight(), "Shh");
        louis.kissSmn(elly);
        louis.sayTo(elly, "Just let me put the baby to bed and then I'll listen to everything.");
        elly.putDown(finishedPicture, Place.WINDOWSILL);
        louis.lookAt(gadge);
        louis.goTo(Place.LADDER);
        Entity entity = new Entity();
        entity.triggerLouis(louis);
        louis.lookAround();
        louis.clutch(gadge);
        louis.feel(Emotion.GOOSEBUMPS);
        louis.think("What's wrong?");
        louis.feel(Emotion.DISTURBANCE);
        louis.think("What the hell is it? Ghosts? Christ, it really feels as if something just brushed by me in this hallway, something I almost saw.");
        door.open();
        louis.jump();
        louis.laugh();
        louis.feel(Emotion.TREMORS);
        louis.goTo(Place.GADGE_ROOM);
        louis.putDown(gadge, gadgeBed.getPlace());
        gadgeBed.rock();
        louis.putBlanketOver(gadge);
        louis.remember(scene);
        louis.think("Good God, what gave you the horrors? Let it go! Dump it!");
        louis.kissSmn(gadge);
        louis.goTo(Place.HALL);
        elly.goTo(Place.HALL);
        louis.lookAt(elly);
        elly.sayTo(elly.getPersonAtSight(), "My first day at school!");
    }
}
