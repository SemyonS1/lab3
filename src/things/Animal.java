package things;

import people.Person;

@SuppressWarnings("unused")
abstract class Animal {
    private String name;
    protected Animal(String name){
        this.name = name;
    }
    @SuppressWarnings("unused")
    public abstract void interactW(Person person);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
