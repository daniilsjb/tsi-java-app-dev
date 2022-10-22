package lv.tsi.exercise_2;

class SyncMain {

    public static void main(String[] args) throws InterruptedException {
        final var taskManager = new TaskManager();

        var threadA = new TaskThread("A", 100, taskManager);
        var threadB = new TaskThread("B", 101, taskManager);
        var threadC = new TaskThread("C", 102, taskManager);

        threadA.start();
        Thread.sleep(2L);
        threadB.start();
        Thread.sleep(2L);
        threadC.start();

        // When `synchronized` keyword is used, the messages are always output
        // on a thread-by-thread basis, i.e., the next thread is not allowed to
        // execute the task until the previous one has finished. Without it,
        // the printing order becomes jumbled and unpredictable.

        // This happens because the `taskManager` object is shared between the
        // threads, therefore each thread acquires an intrinsic lock to it once
        // it begins performing the task, delaying execution of other threads
        // until the lock is released.
    }
}
