package lesson09;

public class AppMain {
    public static void main(String[] args) {
        Employee person1 = new Employee();
        person1.setName("John");
        person1.setAge(25);
        person1.setGender("male");
        person1.setSalary(1000);

        Employee person2 = new Employee();
        person2.setName("John");
        person2.setAge(30);
        person2.setGender("male");
        person2.setSalary(2000);

        Employee person3 = new Employee();
        person3.setName("Jack");
        person3.setAge(30);
        person3.setGender("male");
        person3.setSalary(3000);

        System.out.println(person1.isSameName(person2));
        System.out.println(person1.isSameName(person3));
        System.out.println(Salary.getSum(new Employee[]{person1, person2, person3}));

    }
}
