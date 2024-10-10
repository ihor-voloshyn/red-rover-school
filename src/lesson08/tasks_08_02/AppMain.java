package lesson08.tasks_08_02;

import static lesson08.tasks_08_02.TaxCalculator.calculateTaxes;

/*
Задача №2
Создать класс Employee , в котором хранится информация о сотруднике предприятия:
имя, месячная зарплата, количество детей.
Создать класс TaxPayment, в котором будет храниться имя сотрудника и сумма
подоходного налога, который он должен будет заплатить.
Создать метод, который получит массив сотрудников, и вернет (или распечатает, но
лучше, если вернет) массив налоговых выплат (TaxPayment) по следующему правилу:
● Если зарплата больше 10000, то налоговая ставка 23%
● Если зарплата от 5000 до 10000, то налог составляет 18%
● Если зарплата меньше 5000, то налог составляет 13%
● За каждого ребенка из зарплаты вычитается 1000, и налог берется с оставшейся
суммы.
 */
public class AppMain {
    public static void main(String[] args) {
        Employee jane = new Employee("Jane", 11000, 2);
        Employee johne = new Employee("Johne", 5000, 1);
        Employee jack = new Employee("Jack", 4000, 3);

        Employee[] employees = {jane, johne, jack};
        TaxPayment[] taxPayments = calculateTaxes(employees);

        for (int i = 0; i < taxPayments.length; i++) {
            System.out.println("Name: " + taxPayments[i].employeeName + " : Tax: " + taxPayments[i].taxAmount);
        }
    }
}
