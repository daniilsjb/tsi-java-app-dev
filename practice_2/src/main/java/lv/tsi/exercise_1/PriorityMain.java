package lv.tsi.exercise_1;

class PriorityMain {

    public static void main(String[] args) {
        var threadA = new PriorityThread("min");
        var threadB = new PriorityThread("norm");
        var threadC = new PriorityThread("max");

        threadA.setPriority(Thread.MIN_PRIORITY);
        threadB.setPriority(Thread.NORM_PRIORITY);
        threadC.setPriority(Thread.MAX_PRIORITY);

        threadA.start();
        threadB.start();
        threadC.start();
    }
}
