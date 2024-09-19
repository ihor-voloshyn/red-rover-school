package lesson06.v02_gen;

class Director {
    private Employee employee;
    private int numberOfSubordinates;

    public Director(Employee employee) {
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
        return employee.getBaseSalary() * (1 + numberOfSubordinates / 100.0 * 9);
    }
}

