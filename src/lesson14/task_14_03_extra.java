package lesson14;

import java.util.ArrayList;
import java.util.List;

/*
Экстра задача (без номера)
Попробуйте изменить тип итерационной переменной из цикла, в третьей задаче, на
Integer (не int, а Integer) и добиться такого же результата как и с типом int.
 */
public class task_14_03_extra {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (Integer i = 100; i < 1000; i++) {
            list.add(i);
        }
        System.out.println(list);

        for (Integer k = 0; k < list.size(); k++) {
            if (list.get(k) % 2 == 0) {
                Integer tmp1 = k;
                Integer tmp2 = list.get(k);
                list.remove(k.intValue());
                k--;
            }
        }
        System.out.println(list);
    }
}
