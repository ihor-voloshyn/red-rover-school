package lesson05.tasks_05_01;

/*
Задача №3
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести минимальное значение массива.
 */
public class Task_05_01_03 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (min > element) {
                min = element;
            }
        }
        System.out.println(min);
    }
}
