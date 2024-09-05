package lesson04;

import java.util.Arrays;

/*
Задача со звездочкой
Дан массив из десяти произвольных целых чисел (например, { 1, 2, …, 9, 10 } )
Необходимо изменить порядок элементов массива на противоположный (т.е. чтобы
получилось { 10, 9, …, 2, 1 } ). Не НАПЕЧАТАТЬ в обратном порядке, а переставить
элементы массива.
 */
public class Task_04_04_Extra_v1 {
    public static void main(String[] args) {
        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6, 1};
        int sizeArray = array1.length;
        int[] array2 = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array2[i] = array1[i];
        }
        System.out.println(Arrays.toString(array1));
        for (int i = 0; i < sizeArray; i++) {
            array1[i] = array2[sizeArray - i - 1];
        }
        System.out.println(Arrays.toString(array1));
    }
}
