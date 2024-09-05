package lesson05.tasks_05_03;

/*
Задача №2
0 1 2 3 4 5 6 7 8 9
  0 1 2 3 4 5 6 7 8
    0 1 2 3 4 5 6 7
      0 1 2 3 4 5 6
        0 1 2 3 4 5
          0 1 2 3 4
            0 1 2 3
              0 1 2
                0 1
                  0
 */
public class Task_05_03_02 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }
            //System.out.print("  ".repeat(i));

            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}
