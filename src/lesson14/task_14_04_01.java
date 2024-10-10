package lesson14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Задача №4
Найти наиболее часто встречающееся слово в следующем тексте:
Lorem ipsum odor amet, consectetuer adipiscing elit. Viverra cursus
nec volutpat luctus torquent. Purus rutrum cursus hac tempus ornare.
Arcu hendrerit posuere sit interdum non. Neque tortor feugiat fusce
libero quam fames eu lacinia. Non scelerisque porta auctor ipsum eu
sem? Taciti nascetur posuere natoque; dolor tincidunt at. Magnis
tincidunt litora natoque per himenaeos velit. Consequat quis
vestibulum ornare tortor quam pharetra. Proin ante ex habitasse
consequat habitant a consequat.
Suscipit quis scelerisque elementum morbi massa auctor magnis, massa
habitasse. Quis libero pellentesque aenean; dolor nec potenti
porttitor sem. Sagittis litora per tristique cubilia ultricies
ridiculus. Urna sagittis hendrerit integer suspendisse potenti
euismod suscipit phasellus lectus. Id tellus mollis id nostra nisi
condimentum adipiscing nibh. Aptent efficitur laoreet dolor ornare
sagittis sapien. Feugiat fusce scelerisque metus cursus aenean
ornare venenatis sagittis. Aliquam integer risus tincidunt hendrerit
fames eleifend varius ligula.
 */
public class task_14_04_01 {
    public static void main(String[] args) {
        String text =
                "Lorem ipsum odor amet, consectetuer adipiscing elit. Viverra cursus\n" +
                        "nec volutpat luctus torquent. Purus rutrum cursus hac tempus ornare.\n" +
                        "Arcu hendrerit posuere sit interdum non. Neque tortor feugiat fusce\n" +
                        "libero quam fames eu lacinia. Non scelerisque porta auctor ipsum eu\n" +
                        "sem? Taciti nascetur posuere natoque; dolor tincidunt at. Magnis\n" +
                        "tincidunt litora natoque per himenaeos velit. Consequat quis\n" +
                        "vestibulum ornare tortor quam pharetra. Proin ante ex habitasse\n" +
                        "consequat habitant a consequat.\n" +
                        "Suscipit quis scelerisque elementum morbi massa auctor magnis, massa\n" +
                        "habitasse. Quis libero pellentesque aenean; dolor nec potenti\n" +
                        "porttitor sem. Sagittis litora per tristique cubilia ultricies\n" +
                        "ridiculus. Urna sagittis hendrerit integer suspendisse potenti\n" +
                        "euismod suscipit phasellus lectus. Id tellus mollis id nostra nisi\n" +
                        "condimentum adipiscing nibh. Aptent efficitur laoreet dolor ornare\n" +
                        "sagittis sapien. Feugiat fusce scelerisque metus cursus aenean\n" +
                        "ornare venenatis sagittis. Aliquam integer risus tincidunt hendrerit\n" +
                        "fames eleifend varius ligula.";

        text = text.replace(".", "")
                .replace(",", "")
                .replace(":", "")
                .replace(";", "")
                .replace("?", "")
                .replace("\n", " ")
                .replace("  ", " ")
                .toLowerCase();

        String[] array = text.split(" ");

        Set<String> set = new HashSet<>();
        for (String elm : array) {
            set.add(elm);
        }

        Map<String, Integer> map = new HashMap<>();
        for (String elm : set) {
            map.put(elm, 0);
        }

        for (String elm : array) {
            int value = map.get(elm) + 1;
            map.put(elm, value);
        }

        System.out.println(map);

    }
}
