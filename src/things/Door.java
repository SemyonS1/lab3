package things;

import enumerations.*;

public class Door extends Thing{
    public DoorState state;
    public Door(Place place, int quantity, DoorState state){
        super(place, quantity);
        this.state = state;
    }

    public void open(){
        if (this.state == DoorState.OPEN) {
            System.exit(1);
        }
        System.out.println("*screach noises*");
        this.state = DoorState.OPEN;
    }
}
