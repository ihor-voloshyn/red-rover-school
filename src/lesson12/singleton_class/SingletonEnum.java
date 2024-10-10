package lesson12.singleton_class;

public enum SingletonEnum {
    INSTANCE("Initial class info");

    private String info;

    private SingletonEnum(String info) {
        this.info = info;
    }

    public SingletonEnum getInstance() {
        return INSTANCE;
    }

    // getters and setters
}
