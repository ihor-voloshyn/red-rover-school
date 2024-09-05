package lesson05.tasks_05_02;

/*
Задача №2
Дана строка:
String s = "Перевыборы выбранного президента";
необходимо подсчитать количество букв "е" в строке.
Для указанной строки ответ будет 4.
 */
public class Task_05_02_02_v2 {
    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е') {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}
