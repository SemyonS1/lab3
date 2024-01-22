package things;

import people.Person;

abstract class Animal {
    private String name;
    protected Animal(String name){
        this.name = name;
    }
    public abstract void interactW(Person person);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
