package lesson08.tasks_08_01;

public class Task_08_01 {
    public static String numberToString(int number) {
        String[] numbers = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String numberString = Integer.toString(number);

        if (numberString.isEmpty()) {
            return "";
        }

        String result = numbers[numberString.charAt(0) - '0'];
        for (int i = 1; i < numberString.length(); i++) {
            result += " " + numbers[numberString.charAt(i) - '0'];

        }

        return result;
    }
}
