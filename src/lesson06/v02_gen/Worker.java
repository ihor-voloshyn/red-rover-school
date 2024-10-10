package lesson06.v02_gen;

public class Worker {
    private Employee employee;



    public Worker(Employee employee) {
        this.employee = employee;
    }

    public double getSalary() {
        return employee.getBaseSalary();
    }
}
