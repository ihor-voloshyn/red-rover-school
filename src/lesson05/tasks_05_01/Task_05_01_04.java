package lesson05.tasks_05_01;

/*
Задача №4
Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива.
 */
public class Task_05_01_04 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        System.out.println(1.0*sum/ array.length);
    }
}
