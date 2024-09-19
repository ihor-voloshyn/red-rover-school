package lesson08.tasks_08_02;

public class TaxCalculator {
    public static TaxPayment[] calculateTaxes(Employee[] employees) {
        TaxPayment[] taxPayments = new TaxPayment[employees.length];

        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            double salary = employee.salary;
            int children = employee.numberOfChildren;

            double taxableSalary = salary - (children * 1000);

            if (taxableSalary < 0) {
                taxableSalary = 0;
            }

            double taxRate;
            if (salary > 10000) {
                taxRate = 0.23;
            } else if (salary >= 5000) {
                taxRate = 0.18;
            } else {
                taxRate = 0.13;
            }

            double taxAmount = taxableSalary * taxRate;

            taxPayments[i] = new TaxPayment(employee.employeeName, taxAmount);
        }
        return taxPayments;
    }

}
