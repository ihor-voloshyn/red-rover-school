package lesson07;

/*
Задачи №2
https://www.codewars.com/kata/53ee5429ba190077850011d4/train/java
https://www.codewars.com/kata/555086d53eac039a2a000083/train/java
https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java
https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
 */
public class Task_07_02 {
    public static int doubleInteger(int i) {
        return i * 2;
    }

    public static boolean isLove(final int flower1, final int flower2) {
        return (flower1 + flower2) % 2 != 0;
    }

    public static String numberToString(int num) {
        return "" + num;
    }

    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int elm : args) {
            if (min > elm) {
                min = elm;
            }
        }
        return min;
    }

    public static String countingSheep(int num) {
        String str = "";
        for (int i = 1; i <= num; i++) {
            str += i + " sheep...";
        }
        return str;
    }
}
