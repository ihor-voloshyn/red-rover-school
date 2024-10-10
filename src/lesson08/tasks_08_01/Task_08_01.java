package lesson08.tasks_08_01;

public class Task_08_01 {
    public static String numberToString(int number) {
        String[] numbers = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String numberString = Integer.toString(number);

        if (numberString.isEmpty()) {
            return null;
        }

        String result = numbers[Character.getNumericValue(numberString.charAt(0))];
        for (int i = 1; i < numberString.length(); i++) {
            result += " " + numbers[Character.getNumericValue(numberString.charAt(i))];
        }

        return result;
    }
}
