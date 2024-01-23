package things;

import enumerations.Place;
import people.Person;

import java.util.ArrayList;

public class Scene {
    private final ArrayList<Coffin> contents;
    public Scene(ArrayList<Coffin> contents){
        this.contents = contents;
        Person youngLouis = new Person(Place.EXHIBITION, 36, "Louis", 120);
        youngLouis.lookAt(this.getContents());
    }
    public void setContents(Coffin coffin){
        this.contents.add(coffin);
    }
    public Coffin getContents() {
        for (Coffin content : this.contents) {
            return content;
        }
        return null;
    }
}
