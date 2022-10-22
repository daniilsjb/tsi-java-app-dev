package lv.tsi.exercise_3;

import java.util.concurrent.BlockingQueue;

class TakingThread extends Thread {

    private final BlockingQueue<String> queue;

    public TakingThread(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            sleep(1000L);
            System.out.println("Taken: " + queue.take());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
