package lesson12.task_12_01;

public abstract class Headphones {
    private String brand;
    private String model;

    public Headphones(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getDetails() {
        return brand + " " + model;
    }
}
