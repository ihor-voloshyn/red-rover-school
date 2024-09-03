package lesson04;

/*
Задача №2
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести все значения массива больше 5.
 */
public class Task_04_02 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int element : array) {
            if (element > 5) {
                System.out.println(element);
            }
        }
    }
}
