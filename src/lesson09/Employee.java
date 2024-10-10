package lesson09;

/*
Задача №2
Необходимо создать класс Employee с полями как у Person (из предыдущего задания)
и поле зарплата. Класс должен иметь метод isSameName(Employee employee) который
возвращает true, если у сотрудника у которого был вызван метод и сотрудника который
был передан как параметр, одинаковое имя.
 */
public class Employee extends Person {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isSameName(Employee employee) {
        return this.getName().equals(employee.getName());
    }
}
