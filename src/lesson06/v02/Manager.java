package lesson06.v02;

class Manager {
    private Employee employee;
    private int numberOfSubordinates;

    public Manager(Employee employee) {
        this.employee = employee;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public double getSalary() {
        if (numberOfSubordinates == 0) {
            return employee.getBaseSalary();
        }
        return employee.getBaseSalary() * (1 + numberOfSubordinates / 100.0 * 3);
    }
}
