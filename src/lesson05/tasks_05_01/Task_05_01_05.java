package lesson05.tasks_05_01;

/*
Задача №5
Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести сумму элементов массива.
 */
public class Task_05_01_05 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        System.out.println(sum);
    }
}
