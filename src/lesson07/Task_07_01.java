package lesson07;

/*
Задача №1
Необходимо написать 4 метода:
● сложение 2х чисел
● вычитание 2х чисел
● умножение 2х чисел
● деление 2х чисел
 */
public class Task_07_01 {
    public static void main(String[] args) {
        System.out.println(multiply(1.0, 2.0));
        System.out.println(divide(9, 2));
        System.out.println(divide(9, 2.0));


    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}
