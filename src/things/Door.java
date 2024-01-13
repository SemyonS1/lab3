package things;

import enumerations.*;
import exceptions.DoorStateException;
import exceptions.OpenDoorException;

public class Door extends Thing{
    public DoorState state;
    public Door(Place place, int quantity, int weight, DoorState state) {
        super(place, quantity, weight);
        this.state = state;
    }
    public DoorState getState() throws DoorStateException{
        if ((state != DoorState.OPEN) && (state != DoorState.CLOSED)){
            throw new DoorStateException("Так нельзя");
        }
        else{
            return this.state;
        }
    }
    public boolean isValidState(){
        try{
            getState();
            System.out.println("normal");
            return true;
        }
        catch (DoorStateException doorStateException){
            System.out.println("ne normal");
            return false;
        }
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
