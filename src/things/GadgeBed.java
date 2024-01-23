package things;

import enumerations.Place;

public class GadgeBed extends Thing{
    public GadgeBed(Place place, double weight){
        super(place, weight);
    }
    public void rock(){
        System.out.printf("%n%s", "*bed rocking*");
    }
}
