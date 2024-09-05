package lesson05.tasks_05_02;

/*
Задача №1
Дана строка:
String s = “Перестановочный алгоритм быстрого действия”;
необходимо вывести все буквы “о” из этой строки.
Для указанной строки ответ будет “ооооо” (или в столбик)
 */
public class Task_05_02_01_v1 {
    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";
        String substr = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                substr += s.charAt(i);
            }
        }
        System.out.println(substr);
    }
}
