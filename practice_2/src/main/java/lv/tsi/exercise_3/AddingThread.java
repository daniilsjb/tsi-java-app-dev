package lv.tsi.exercise_3;

import java.util.concurrent.BlockingQueue;

class AddingThread extends Thread {

    private final BlockingQueue<String> queue;

    public AddingThread(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            var element = "Element #" + i;
            queue.add(element);
            System.out.println("Added: " + element);
        }
    }
}
