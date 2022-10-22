package lv.tsi.exercise_2;

class TaskManager {

    public synchronized void performTask(int taskId) {
        System.out.println("[" + Thread.currentThread().getName() + "] " + taskId);

        try {
            Thread.sleep(4L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("[" + Thread.currentThread().getName() + "] " + taskId);
    }
}
