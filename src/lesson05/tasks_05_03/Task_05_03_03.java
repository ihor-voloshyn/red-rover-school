package lesson05.tasks_05_03;

/*
Задача №3
9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
  8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
    7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
      6 5 4 3 2 1 0 1 2 3 4 5 6
        5 4 3 2 1 0 1 2 3 4 5
          4 3 2 1 0 1 2 3 4
            3 2 1 0 1 2 3
              2 1 0 1 2
                1 0 1
                  0
 */
public class Task_05_03_03 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(" ".repeat(i*2));

            for (int j = 9 - i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            for (int k = 1; k < 10 - i; k++) {
                System.out.print(k + " ");
            }

            System.out.println();

        }
    }
}
