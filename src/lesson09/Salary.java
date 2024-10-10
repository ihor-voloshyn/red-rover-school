package lesson09;

/*
Задача №3
Необходимо создать класс Salary с единственным методом - getSum(Employee[]
employeeArray), метод должен возвращать сумму зарплат всех сотрудников из массива
переданного в качестве аргумента вызова метода.
 */
public class Salary {
    public static double getSum(Employee[] employeeArray) {
        double result = 0;
        for (Employee employee : employeeArray) {
            result += employee.getSalary();
        }
        return result;
    }
}
