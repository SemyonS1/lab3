import people.*;
import things.*;
import enumerations.*;



public class Main {
    public static void main(String[] args) {
        Person louis = new Person(Place.WINDOWSILL, 36, "Louis", 120);
        Person gadge = new Person(Place.WINDOWSILL, 36, "Gadge", 120);
        Person rachel = new Person(Place.HALL, 36, "Rachel", 120);
        Person elly =  new Person(Place.WINDOWSILL, 36, "Elly", 120);
        Door door = new Door(Place.ENTRANCE, 1, 5, DoorState.CLOSED);
        Cat church = new Cat("Church");
        Person uncle = new Person(Place.EXHIBITION, 36, "Uncle", 120);
        Deck deck = new Deck(Place.EXHIBITION, 1000, 1);
        Coffin coffin = uncle.createCoffin(deck);
        uncle.lightCoffinTops();
        Picture picture = new Picture(Place.HALL, 1, 0.1);
        Scene scene = new Scene(coffin);

        elly.jump();
        rachel.lookAt(louis);
        Picture finishedPicture = elly.draw(picture);
        louis.lookAt(gadge);
        louis.hold(louis.getPersonAtSight());
        gadge.feel(Emotion.SLEEPY);
        gadge.sleep();
        gadge.lookAt(rachel);
        rachel.feel(Emotion.DESPAIR);
        if (rachel.getEmotionalState() == Emotion.DESPAIR){
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
        louis.putDown(gadge, Place.GADGE_BED);
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
