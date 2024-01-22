package things;

import enumerations.Place;

import java.util.ArrayList;

public class Picture extends Thing{
    private ArrayList<Object> contents;
    public Picture(Place place, double weight){
        super(place, weight);
        this.contents = new ArrayList<>();
    }
    public void setContents(Object content){
        this.contents.add(content);
    }
    public Object getContents(){
        for (Object cont: this.contents) {
            return cont;
        }
        return null;
    }
}
