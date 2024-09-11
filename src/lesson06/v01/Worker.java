package lesson06.v01;

public class Worker extends Employee {

    @Override
    public double getSalary() {
        return getBaseSalary();
    }
}
