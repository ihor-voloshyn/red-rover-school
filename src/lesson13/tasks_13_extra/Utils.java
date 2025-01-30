package lesson13.tasks_13_extra;

public class Utils {
    public static String declareWinner1(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        Fighter[] fighters = new Fighter[]{fighter1, fighter2};
        int idAttacker = fighter1.name.equals(firstAttacker) ? 0 : 1;
        Fighter attacker = fighters[idAttacker % 2];
        Fighter defender = fighters[(idAttacker + 1) % 2];

        while (true) {
            defender.health -= attacker.damagePerAttack;
            if (defender.health > 0) {
                System.out.println(attacker.name + " attacks "
                        + defender.name + "; "
                        + defender.name + " now has "
                        + defender.health + " health.");
            } else {
                System.out.println(attacker.name + " attacks "
                        + defender.name + "; "
                        + defender.name + " now has "
                        + defender.health + " health and is dead. "
                        + attacker.name + " wins.");
                return attacker.name;
            }

            idAttacker += 1;
            attacker = fighters[idAttacker % 2];
            defender = fighters[(idAttacker + 1) % 2];
        }
    }

    public static String declareWinner2(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter attacker = fighter1, defender = fighter2;
        if (firstAttacker.equals(fighter2.name)) {
            attacker = fighter2;
            defender = fighter1;
        }
        while (true) {
            if ((defender.health -= attacker.damagePerAttack) <= 0) return attacker.name;  // a wins
            if ((attacker.health -= defender.damagePerAttack) <= 0) return defender.name;  // b wins
        }
    }

    public static String declareWinner3(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter[] fighters = new Fighter[]{fighter1, fighter2};
        int idAttacker = fighter1.name.equals(firstAttacker) ? 0 : 1;
        Fighter attacker = fighters[idAttacker % 2];
        Fighter defender = fighters[(idAttacker + 1) % 2];

        while (true) {
            defender.health -= attacker.damagePerAttack;
            if (defender.health <= 0) {
                return attacker.name;
            }
            idAttacker += 1;
            attacker = fighters[idAttacker % 2];
            defender = fighters[(idAttacker + 1) % 2];
        }
    }
}
