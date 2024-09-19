package lesson06.v02_gen;

public class Employee {
    private String name;
    private static double baseSalary;

    public static double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return getBaseSalary();
    }
}
