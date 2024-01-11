package things;

import enumerations.Place;

public class Coffin extends Thing {
    public Coffin(Place place, int quantity){
        super(place, quantity);
        CoffinTop coffinTop = new CoffinTop();

    }
    public class CoffinTop extends Thing{
        public static int levelOfLighting;
        public CoffinTop(){
            this.place = Coffin.this.place;
            this.quantity = Coffin.this.quantity;
        }

    }

}
