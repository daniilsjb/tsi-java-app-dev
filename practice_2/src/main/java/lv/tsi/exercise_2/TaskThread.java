package lv.tsi.exercise_2;

class TaskThread extends Thread {

    private final int taskId;
    private final TaskManager taskManager;

    public TaskThread(String name, int taskId, TaskManager taskManager) {
        super(name);
        this.taskId = taskId;
        this.taskManager = taskManager;
    }

    @Override
    public void run() {
        taskManager.performTask(taskId);
    }
}
