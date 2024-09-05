package lesson05.tasks_05_02;

/*
Задача №3
Дана строка:
String s = “Посмотрите как Рите нравится ритм”;
необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
Для указанной строки ответ будет 6, 15, 29.
 */
public class Task_05_02_03 {
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм".toLowerCase();
        String substr = "рит";
        for (int i = 0; i <= s.length() - substr.length(); i++) {
            if (s.startsWith(substr, i)) {
                System.out.println(i);
            }
        }

    }
}
