package things;

import enumerations.Place;

public class Coffin extends Thing {
    public Coffin(Place place, int weight){
        super(place, weight);
        CoffinTop coffinTop = new CoffinTop(Place.EXHIBITION, 1);
    }
    public class CoffinTop extends Thing{
        public CoffinTop(Place place, int weight){
            super(place, weight);
        }
    }
}
