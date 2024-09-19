package lesson06.v01_oop;

public class Manager extends Worker {
    private int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        if (numberOfSubordinates == 0) {
            return getBaseSalary();
        }
        return getBaseSalary() * (1 + (numberOfSubordinates / 100.0) * 3);
    }
}
