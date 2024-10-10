package lesson06.v02_gen;

class Manager {
    private Employee employee;
    private int numberOfSubordinates;

    public Manager() {}

    public Manager(Employee employee) {
        this.employee = employee;
    }

    static Manager makeManager(Employee employee, int numberOfSubordinates) {
        Manager manager = new Manager();
        manager.employee = employee;
        manager.numberOfSubordinates = numberOfSubordinates;
        return manager;
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
