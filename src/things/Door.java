package things;

import enumerations.*;
import exceptions.OpenDoorException;

public class Door extends Thing{
    public DoorState state;
    public Door(Place place, int quantity, int weight, DoorState state) {
        super(place, quantity, weight);
        this.state = state;
    }



    public void open() throws OpenDoorException{
        if (this.state == DoorState.OPEN) {
            throw new OpenDoorException("Почему дверь открывается дважды?");
        }
        System.out.printf("%n%s","*screach noises*");
        this.state = DoorState.OPEN;
    }
}
