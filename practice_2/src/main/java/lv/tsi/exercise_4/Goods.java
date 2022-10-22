package lv.tsi.exercise_4;

class Goods {

    private int amount;

    public synchronized void produce(int amount) {
        while (this.amount != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        this.amount = amount;
        notify();
    }

    public synchronized int consume() {
        while (this.amount == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        int amount = this.amount;
        this.amount = 0;

        notify();
        return amount;
    }
}
