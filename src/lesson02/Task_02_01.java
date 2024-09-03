package lesson02;

public class Task_02_01 {
    public static void main(String[] args) {
        int a = 10; // присвоим произвольное значение
        int b = 3;  // присвоим произвольное значение

        // Операции
        int sum = a + b;
        int product = a * b;
        int difference = a - b;
        int division = a / b;
        int remainder = a % b;

        // Вывод результатов
        System.out.println("Сложение: a + b = " + sum);
        System.out.println("Умножение: a * b = " + product);
        System.out.println("Вычитание: a - b = " + difference);
        System.out.println("Деление: a / b = " + division);
        System.out.println("Остаток от деления: a % b = " + remainder);

        // Проверка на четность
        System.out.println("a = " + a + " четное? " + (a % 2 == 0));
        System.out.println("b = " + b + " четное? " + (b % 2 == 0));
    }
}
