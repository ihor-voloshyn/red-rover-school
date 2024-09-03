package lesson04;

import java.util.Arrays;

/*
Задача №3
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо увеличить все значения массива на 15.
 */
public class Task_04_03 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] += 15;
        }
        System.out.println(Arrays.toString(array));
    }
}
