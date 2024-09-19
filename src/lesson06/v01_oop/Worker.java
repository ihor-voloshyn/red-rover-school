package lesson06.v01_oop;

public class Worker extends Employee {

    @Override
    public double getSalary() {
        return getBaseSalary();
    }
}
