package lesson03;

/*
Задача №2
Необходимо вывести все положительные степени числа 5 которые меньше 10000,
вывести результат возведения в степень.
 */
public class Task_03_02_02 {
    public static void main(String[] args) {
        int base = 5;

        for (int result = 1; result < 10000; result = result * base) {
            if (result < 10000) {
                System.out.println(result);
            }
        }
    }
}
