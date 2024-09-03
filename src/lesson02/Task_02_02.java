package lesson02;

public class Task_02_02 {
    public static void main(String[] args) {
        int totalLoot = 1000; // Размер добычи в пиастрах
        int pirates = 11;     // Количество пиратов на корабле, включая капитана

        int shipOwnerShare = totalLoot / 2;
        int remainingLoot = totalLoot - shipOwnerShare;
        int captainShare = remainingLoot / 2;
        int crewShare = (remainingLoot - captainShare) / pirates;
        int rest = totalLoot - shipOwnerShare - captainShare - crewShare * pirates;

        System.out.println("Владелец корабля получает: " + shipOwnerShare + " пиастров");
        System.out.println("Капитан Джек Воробей получает: " + (captainShare + crewShare) + " пиастров");
        System.out.println("Если капитан - владелец судна, то он получает:" + (shipOwnerShare + captainShare + crewShare) + " пиастров");
        System.out.println("Каждый пират получает: " + crewShare + " пиастров");
        System.out.println("Остаток: " + rest);

        // Проверка правильности дележа
        int totalDistributed = shipOwnerShare + captainShare + crewShare * pirates + rest;
        System.out.println("Правильность дележа: " + (totalDistributed == totalLoot));
    }
}
