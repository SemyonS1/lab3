package things;

import enumerations.*;
import exceptions.OpenDoorException;

public class Door extends Thing{
    public DoorState state;
    public Door(Place place, int quantity, DoorState state){
        super(place, quantity);
        this.state = state;
    }

    public void openEx(){
        if (this.state == DoorState.OPEN) {
            throw new OpenDoorException("Почему дверь открывается дважды?");
        }
        System.out.printf("%n%s","*screach noises*");
        this.state = DoorState.OPEN;
    }
    public void open(){
        try{
            openEx();
        }
        catch(OpenDoorException openDoorException){
            System.out.printf("%n%s","Нельзя так");
        }
    }
}
