package lesson14;

import java.util.ArrayList;
import java.util.List;

/*
Задача №2
Создать лист со значениями от 100 до 1000.
 */
public class task_14_02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 100; i < 1000; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
