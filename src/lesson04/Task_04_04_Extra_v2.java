package lesson04;

import java.util.Arrays;

/*
Задача со звездочкой
Дан массив из десяти произвольных целых чисел (например, { 1, 2, …, 9, 10 } )
Необходимо изменить порядок элементов массива на противоположный (т.е. чтобы
получилось { 10, 9, …, 2, 1 } ). Не НАПЕЧАТАТЬ в обратном порядке, а переставить
элементы массива.
 */
public class Task_04_04_Extra_v2 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6, 1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
