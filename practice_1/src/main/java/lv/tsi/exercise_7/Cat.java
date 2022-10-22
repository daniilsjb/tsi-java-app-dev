package lv.tsi.exercise_7;

class Cat implements Domestic {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("Cat's name is " + this.name);
    }
}
