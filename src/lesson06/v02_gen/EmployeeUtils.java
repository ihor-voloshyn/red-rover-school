package lesson06.v02_gen;

class EmployeeUtils {

    // Поиск сотрудника по имени
    public static Employee findByName(Employee[] employees, String name) {
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                return employee;
            }
        }
        return null;
    }

    // Поиск сотрудника по части имени
    public static Employee findByPartOfName(Employee[] employees, String part) {
        for (Employee employee : employees) {
            if (employee.getName().toLowerCase().contains(part.toLowerCase())) {
                return employee;
            }
        }
        return null;
    }

    // Подсчет общего зарплатного бюджета
    public static double calculateTotalSalary(Employee[] employees) {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;
    }

    // Поиск сотрудника с минимальной зарплатой
    public static Employee findWithMinSalary(Employee[] employees) {
        if (employees.length == 0) return null;
        Employee minSalaryEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employees[i];
            }
        }
        return minSalaryEmployee;
    }

    // Поиск сотрудника с максимальной зарплатой
    public static Employee findWithMaxSalary(Employee[] employees) {
        if (employees.length == 0) return null;
        Employee maxSalaryEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employees[i];
            }
        }
        return maxSalaryEmployee;
    }

    // Поиск менеджера с минимальным количеством подчиненных
    public static Manager findWithMinSubordinates(Manager[] managers) {
        if (managers.length == 0) return null;
        Manager minSubordinatesManager = managers[0];
        for (int i = 1; i < managers.length; i++) {
            if (managers[i].getNumberOfSubordinates() < minSubordinatesManager.getNumberOfSubordinates()) {
                minSubordinatesManager = managers[i];
            }
        }
        return minSubordinatesManager;
    }

    // Поиск менеджера с максимальным количеством подчиненных
    public static Manager findWithMaxSubordinates(Manager[] managers) {
        if (managers.length == 0) return null;
        Manager maxSubordinatesManager = managers[0];
        for (int i = 1; i < managers.length; i++) {
            if (managers[i].getNumberOfSubordinates() > maxSubordinatesManager.getNumberOfSubordinates()) {
                maxSubordinatesManager = managers[i];
            }
        }
        return maxSubordinatesManager;
    }

    // Поиск менеджера с максимальной надбавкой
    public static Manager findWithMaxBonus(Manager[] managers) {
        if (managers.length == 0) return null;
        Manager maxBonusManager = managers[0];
        double maxBonus = managers[0].getSalary() - Employee.getBaseSalary();
        for (int i = 1; i < managers.length; i++) {
            double currentBonus = managers[i].getSalary() - Employee.getBaseSalary();
            if (currentBonus > maxBonus) {
                maxBonus = currentBonus;
                maxBonusManager = managers[i];
            }
        }
        return maxBonusManager;
    }

    // Поиск менеджера с минимальной надбавкой
    public static Manager findWithMinBonus(Manager[] managers) {
        if (managers.length == 0) return null;
        Manager minBonusManager = managers[0];
        double minBonus = managers[0].getSalary() - Employee.getBaseSalary();
        for (int i = 1; i < managers.length; i++) {
            double currentBonus = managers[i].getSalary() - Employee.getBaseSalary();
            if (currentBonus < minBonus) {
                minBonus = currentBonus;
                minBonusManager = managers[i];
            }
        }
        return minBonusManager;
    }
}
