package lv.tsi.exercise_7;

class Animals {

    public static void main(String[] args) {
        var cat = new Cat("Ben");
        var dog = new Dog("Bob");
        var fox = new Fox("Red");

        cat.printName();
        dog.printName();
        fox.printColor();
    }
}
