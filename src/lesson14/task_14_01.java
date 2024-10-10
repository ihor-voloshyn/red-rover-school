package lesson14;

import java.util.ArrayList;
import java.util.List;

/*
Задача №1
Создать лист и добавить в него следующие слова:
● White.
● Tan.
● Yellow.
● Orange.
● Red.
● Pink.
● Purple.
● Blue.
Затем удалить из этого списка все цвета в которых встречается буква “L”
 */
public class task_14_01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("White.", "Tan.", "Yellow.", "Orange.", "Red.", "Pink.", "Purple.", "Blue."));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i)).toLowerCase().contains("l")) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
