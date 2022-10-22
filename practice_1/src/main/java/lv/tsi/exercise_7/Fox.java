package lv.tsi.exercise_7;

class Fox implements Wild {

    private final String color;

    public Fox(String color) {
        this.color = color;
    }

    @Override
    public void printColor() {
        System.out.println("Fox's color is " + color);
    }
}
