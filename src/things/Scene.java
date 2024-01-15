package things;

import enumerations.Place;
import people.Person;

public class Scene {
    private Thing contents;
    public Scene(Thing contents){
        this.contents = contents;
        Person youngLouis = new Person(Place.EXHIBITION, 36, "Louis", 120);
        youngLouis.lookAt(this.getContents());
    }
    public void setContents(Thing contents){
        this.contents = contents;
    }
    public Thing getContents(){
        return this.contents;
    }
}
