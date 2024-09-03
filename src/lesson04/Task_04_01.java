package lesson04;

/*
Задача №1
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести все нечетные числа из массива.
 */
public class Task_04_01 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int element : array) {
            if (element % 2 != 0) {
                System.out.println(element);
            }
        }

    }
}
