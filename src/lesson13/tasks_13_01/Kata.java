package lesson13.tasks_13_01;

public class Kata {

    //https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
    public static String abbrevName(String name) {
        String[] arr = name.split(" ");
        return (arr[0].charAt(0) + "." + arr[1].charAt(0)).toUpperCase();
    }

    //https://www.codewars.com/kata/5aa736a455f906981800360d/train/java
    public static boolean feast(String beast, String dish) {
        return (beast.toLowerCase().charAt(0) == dish.toLowerCase().charAt(0))
                && (beast.toLowerCase().charAt(beast.length() - 1) == dish.toLowerCase().charAt(dish.length() - 1));
    }

    //https://www.codewars.com/kata/5704aea738428f4d30000914/train/java
    public static String tripleTrouble(String one, String two, String three) {
        int lengthString = one.length();
        String result = "";
        for (int i = 0; i < lengthString; i++) {
            result += "" + one.charAt(i) + two.charAt(i) + three.charAt(i);
        }
        return result;
    }

    //https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java
    public static String position(char alphabet) {
        return "Position of alphabet: " + (Character.getNumericValue(alphabet) - 9);
    }

    //https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int result = 0;
        for (int elm : arr1) {
            result += elm;
        }
        for (int elm : arr2) {
            result += elm;
        }
        return result;
    }
}
