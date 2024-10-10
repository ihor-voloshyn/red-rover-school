package lesson12.task_12_02;

public class AppMain {
    public static void main(String[] args) {
        WorkerPool pool = new WorkerPool(3);
        for (int i = 0; i < 10; i++) {
            Worker worker = pool.getWorker();
            worker.doWork("task " + i);
        }
    }
}
