package things;

import enumerations.Place;

public class Coffin extends Thing {
    public Coffin(Place place, int quantity, int weight){
        super(place, quantity, weight);
        CoffinTop coffinTop = new CoffinTop(Place.EXHIBITION, 1000, 1);
    }
    public class CoffinTop extends Thing{
        public static int levelOfLighting;
        public CoffinTop(Place place, int quantity, int weight){
            super(place, quantity, weight);
        }
    }
}
