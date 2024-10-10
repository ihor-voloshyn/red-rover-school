package lesson12.anonymous_class;

public class OuterClass {
    void createRunnable() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in an anonymous class");
            }
        };
        runnable.run();
    }
}
