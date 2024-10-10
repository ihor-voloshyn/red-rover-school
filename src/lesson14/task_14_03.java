package lesson14;

import java.util.ArrayList;
import java.util.List;

/*
Задача №2
Создать лист со значениями от 100 до 1000.

Задача №3
Удалить из листа, созданного в предыдущей задаче, все четные элементы.
 */
public class task_14_03 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 100; i < 1000; i++) {
            list.add(i);
        }
        System.out.println(list);
        for (int k = 0; k < list.size(); k++) {
            if (list.get(k) % 2 == 0) {
                list.remove(k);
                k--;
            }
        }
        System.out.println(list);
    }
}
