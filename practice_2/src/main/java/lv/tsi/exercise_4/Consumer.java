package lv.tsi.exercise_4;

class Consumer extends Thread {

    private final Goods goods;

    public Consumer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        while (true) {
            var amount = goods.consume();
            System.out.println("Consumed: " + amount);

            try {
                sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
