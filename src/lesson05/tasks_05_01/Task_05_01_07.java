package lesson05.tasks_05_01;

/*
Задача №7
Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести количество элементов в массиве.
 */
public class Task_05_01_07 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int cnt = 0;
        for (int[] ints : array) {
            cnt += ints.length;
        }
        System.out.println(cnt);
    }
}
