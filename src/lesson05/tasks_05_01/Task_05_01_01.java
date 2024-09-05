package lesson05.tasks_05_01;

/*
Задача №1
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести сумму всех значений массива.
 */
public class Task_05_01_01 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        System.out.println(sum);
    }
}
