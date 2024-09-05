package lesson05.tasks_05_01;

/*
Задача №2
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести максимальное значение массива.
 */
public class Task_05_01_02 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = Integer.MIN_VALUE;
        for (int element : array) {
            if (max < element) {
                max = element;
            }
        }
        System.out.println(max);
    }
}
