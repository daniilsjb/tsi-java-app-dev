package lv.tsi.exercise_7;

class Dog implements Domestic {

    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("Dog's name is " + this.name);
    }
}
