package lv.tsi.exercise_4;

class Goods {

    // For this implementation, I'm using the following convention:
    // - when amount == 0, goods are ready for production;
    // - when amount != 0, goods are ready for consumption.
    //
    // In principle, we could use a separate field to represent availability,
    // such as a simple boolean value that is set to true when goods are ready
    // for consumption and to false otherwise, but the problem description only
    // mentions one field.
    private int amount;

    public synchronized void produce(int amount) {
        while (this.amount != 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        this.amount = amount;
        this.notify();
    }

    public synchronized int consume() {
        while (this.amount == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        int amount = this.amount;
        this.amount = 0;

        this.notify();
        return amount;
    }
}
