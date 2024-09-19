package lesson06.v01_oop;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker();
        worker1.setBaseSalary(1500);

        Worker worker2 = new Worker();
        worker2.setBaseSalary(2000);

        System.out.println(worker1.getSalary());
        System.out.println(worker2.getSalary());


    }


}
