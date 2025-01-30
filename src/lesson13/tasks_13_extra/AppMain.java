package lesson13.tasks_13_extra;

import static lesson13.tasks_13_extra.Utils.*;

public class AppMain {
    public static void main(String[] args) {
        System.out.println(declareWinner1(new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4), "Lew"));
        System.out.println(declareWinner2(new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4), "Lew"));
        System.out.println(declareWinner3(new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4), "Lew"));
    }
}
