package lesson05.tasks_05_02;

/*
Задача №1
Дана строка:
String s = “Перестановочный алгоритм быстрого действия”;
необходимо вывести все буквы “о” из этой строки.
Для указанной строки ответ будет “ооооо” (или в столбик)
 */
public class Task_05_02_01_v2 {
    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";
        String substr = "";
        for (char ltr : s.toCharArray()) {
            if (ltr == 'о') {
                substr += ltr;
            }
        }
        System.out.println(substr);
    }
}
