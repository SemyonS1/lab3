package things;

import enumerations.Place;

public class Coffin extends Thing {
    public Coffin(Place place, int weight) {
        super(place, weight);
        CoffinTop coffinTop = new CoffinTop(Place.EXHIBITION, 1);
        coffinTop.crackle();
    }
    public class CoffinTop extends Thing {
        public CoffinTop(Place place, int weight) {
            super(place, weight);
        }

        public void crackle() {
            int chance = (int) (Math.random() * 10);
            if (chance == 7) {
                this.setWeight(this.getWeight() - 0.1);
            }
        }
    }
}
