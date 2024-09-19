package lesson06.v01_oop;

public class Director extends Manager {

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        }
        return getBaseSalary() * (1 + (getNumberOfSubordinates() / 100.0) * 9);
    }
}
