package lv.tsi.exercise_4;

import java.util.Random;

class Producer extends Thread {

    private final Goods goods;
    private final Random random;

    public Producer(Goods goods) {
        this.goods = goods;
        this.random = new Random();
    }

    @Override
    public void run() {
        while (true) {
            var amount = 1 + random.nextInt(100);
            goods.produce(amount);
            System.out.println("Produced: " + amount);

            try {
                sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
