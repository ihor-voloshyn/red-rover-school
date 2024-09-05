package lesson05.tasks_05_02;

/*
Экстра задача
Дан массив:
String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”},
{“java”}};
необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
 */
public class Task_05_02_Extra {
    public static void main(String[] args) {
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"},
                {"java"}};
        int cnt = 0;
        for (String[] arrWords : array) {
            for (String word : arrWords) {
                if (!word.toLowerCase().contains("е")) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
