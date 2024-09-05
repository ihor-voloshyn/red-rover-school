package lesson02;

/*
Задача №2
Создать программу дележа добычи на пиратском корабле. По обычаю, половина
добычи идет владельцу корабля, половина оставшегося — капитану, остальное
делится поровну между всеми членами команды, включая капитана.
Размер добычи (например, в пиастрах) и количество пиратов на корабле задать
переменными.
Вывести на экран кому сколько пиастров полагается
Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что
корабль принадлежит ему?

Дополнительное задание со звездочкой
Попробовать придумать как программа может проверить правильность дележа.
 */
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
