package lesson12.task_12_02;

public class WorkerPool {
    private final int poolSize;
    private final Worker[] workers;
    private int currentIndex = 0;

    public WorkerPool(int poolSize) {
        this.poolSize = poolSize;
        this.workers = new Worker[poolSize];

        for (int i = 0; i < poolSize; i++) {
            workers[i] = new Worker(i);
        }
    }

    public Worker getWorker() {
        Worker worker = workers[currentIndex];
        currentIndex = (currentIndex + 1) % poolSize;
        return worker;
    }
}
