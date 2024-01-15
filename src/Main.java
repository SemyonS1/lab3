import people.*;
import things.*;
import enumerations.*;



public class Main {
    public static void main(String[] args) {
        Person louis = new Person(Place.WINDOWSILL, 36, "Louis");
        Person gadge = new Person(Place.WINDOWSILL, 36, "Gadge");
        Person rachel = new Person(Place.HALL, 36, "Rachel");
        Person elly =  new Person(Place.WINDOWSILL, 36, "Elly");
        Entity entity = new Entity();
        Door door = new Door(Place.ENTRANCE, 1, 5, DoorState.CLOSED);
        Cat church = new Cat("Church");
        Person uncle = new Person(Place.EXHIBITION, 36, "Uncle");
        Thing wood = new Thing();
        wood.setWeight(1000);
        wood.setPlace(Place.EXHIBITION);
        wood.setQuantity(1);
        Scene scene = new Scene();


        Coffin coffin = uncle.createCoffin(wood);
        uncle.lightCoffinTops();
        scene.contents = coffin;
        elly.setInjuries(Injury.SCRATCH);
        rachel.lookAt(louis);
        louis.holdSmn(gadge);
        gadge.feel(Emotion.SLEEPY);
        gadge.sleep();
        rachel.feel(Emotion.DESPAIR);
        if (rachel.getEmotionalState() == Emotion.DESPAIR){
            louis.feel(Emotion.FEAR);
            louis.think("We're really going to get old. It's really true. No one's going to make an exception for us. She's on her way … and so are we.");
        }
        elly.goTo(Place.WINDOWSILL);
        elly.showTo(louis, elly.getInjuries(0));
        elly.showTo(louis, );
        elly.sayTo(louis, "Old MacDonald and Mrs Berryman!");
        church.interactW(elly);
        louis.sayTo(elly, "Shh");
        louis.kissSmn(elly);
        louis.sayTo(elly, "Just let me put the baby to bed and then I'll listen to everything.");
        louis.goTo(Place.LADDER);
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
        louis.putSmnDown(gadge, Place.GADGE_BED);
        louis.putBlanketOver(gadge);
        louis.remember(scene);
        louis.think("Good God, what gave you the horrors? Let it go! Dump it!");
        louis.kissSmn(gadge);
        louis.goTo(Place.HALL);
        elly.goTo(Place.HALL);
        elly.sayTo(louis, "My first day at school!");
    }
}
