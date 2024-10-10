package lesson12.task_12_02;

public class Worker {
    private final int id;

    public Worker(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void doWork(String taskSummary) {
        System.out.println("Worker {" + id + "} is doing {" + taskSummary + "}");
    }
}
