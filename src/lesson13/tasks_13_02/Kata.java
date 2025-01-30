package lesson13.tasks_13_02;

public class Kata {


    //https://www.codewars.com/kata/53369039d7ab3ac506000467/train/java
    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }

    //https://www.codewars.com/kata/57356c55867b9b7a60000bd7/train/java
    public static Integer basicMath(String op, int v1, int v2) {
        int result = 0;
        switch (op) {
            case "+":
                result = v1 + v2;
                break;
            case "-":
                result = v1 - v2;
                break;
            case "*":
                result = v1 * v2;
                break;
            case "/":
                if (v2 == 0)
                    throw new IllegalArgumentException("Division by zero");
                result = v1 / v2;
                break;
            default:
                throw new IllegalArgumentException("Unknown operation: " + op);
        }
        return result;
    }

    //https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java
    public static int[] reverse(int n) {
        int[] arr = new int[n];
        for (int i = n; i > 0; i--) {
            arr[n - i] = i;
        }
        return arr;
    }

    //https://www.codewars.com/kata/57e76bc428d6fbc2d500036d/train/java
    public static String[] stringToArray(String s) {
        return s.split(" ");
    }

    //https://www.codewars.com/kata/577bd026df78c19bca0002c0/train/java
    public static String correct(String string) {
        return string.replace('5', 'S')
                .replace('0', 'O')
                .replace('1', 'I');
    }
}


