package lesson03;

/*
Задача №3
Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
Реализовать 2 варианта:
● использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
● без использования конструкции if (шаг цикла на ваше усмотрение)
 */
public class Task_03_02_03 {
    public static void main(String[] args) {
        System.out.println("Решение 1:");
        for (int i = 40; i <= 60; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }

        }

        System.out.println("Решение 2:");
        int j = 40;
        while (j <= 60) {
            System.out.println(j);
            j += 4;
        }

        System.out.println("Решение 3:");
        for (int k = 40; k <= 60; k += 4) {
            System.out.println(k);

        }
    }
}