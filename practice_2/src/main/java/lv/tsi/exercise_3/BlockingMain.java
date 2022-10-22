package lv.tsi.exercise_3;

import java.util.concurrent.LinkedBlockingQueue;

class BlockingMain {

    public static void main(String[] args) {
        final var queue = new LinkedBlockingQueue<String>(3);

        var addingThread = new AddingThread(queue);
        var takingThread = new TakingThread(queue);

        addingThread.start();
        takingThread.start();

        // The observed effect is that the taking thread will not start its
        // execution until the adding thread has finished populating the queue
        // with the three elements. After that, it will take the first element
        // only and print it out.
    }
}
