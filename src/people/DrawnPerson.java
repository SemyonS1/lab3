package people;

import enumerations.Place;

public class DrawnPerson extends Person {
    private String colour;
    public DrawnPerson(Place place, int temperature, String name, int bloodPressure, String colour) {
        super(place, temperature, name, bloodPressure);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
