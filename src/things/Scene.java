package things;

import enumerations.Place;
import people.Person;

import java.util.ArrayList;

public class Scene {
    private ArrayList<Coffin> contents;
    public Scene(ArrayList<Coffin> contents){
        this.contents = contents;
        Person youngLouis = new Person(Place.EXHIBITION, 36, "Louis", 120);
        youngLouis.lookAt(this.getContents());
    }
    public void setContents(ArrayList<Coffin> contents){
        this.contents = contents;
    }
    public Coffin getContents() {
        for (Coffin content : this.contents) {
            return content;
        }
        return null;
    }
}
