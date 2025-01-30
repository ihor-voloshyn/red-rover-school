package lesson18;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class AppMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, -31, -15, 6));
        list.sort((o1, o2) -> o2 - o1);
        System.out.println(list);
        System.out.println(transformInts(list, origin -> origin * origin));
        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer >= 0;
            }
        });
        System.out.println(list);
        System.out.println(list.removeIf(x -> x >= 0));
 
    }

    public static List<Integer> transformInts(List<Integer> ints, Transformer transformer) {
        List<Integer> result = new ArrayList<>();
        for (int origin : ints) {
            int newValue = transformer.transform(origin);
            result.add(newValue);
        }
        return result;
    }

    interface Transformer {
        Integer transform(Integer origin);
    }
}
