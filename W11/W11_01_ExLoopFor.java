package W11;

import java.util.Scanner;

public class W11_01_ExLoopFor {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int result = 0;
        // try {
        //     while (true) {
        //         System.out.print("Enter Something: ");
        //         String input = kb.nextLine();
        //         System.out.print("Enter Time: ");
        //         int time = kb.nextInt();
        //         for (int i = 0; i < time + 1; i++) {
        //             System.out.printf("รอบที่: %d - %s %n", i, input);
        //         }
        //         System.out.println("\n");
        //     }

        // } catch (Exception e) {
        //     System.out.println("[You Close]");
        // } finally {
        //     kb.close();
        // }
        System.out.println("\n");

        for (int i = 1; i < 5; i++) {
            System.out.printf("รอบที่ %d Hello World %n", i);
        }

        System.out.println("\n");

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d", i);
        }

        System.out.println("\n");

        for (int i = 1; i <= 10; i++) {
            result = (result + i);
            if (i < 10) {
                System.out.printf("%d ", i);
            } else {
                System.out.printf("%d = %d", i, result);
            }

        }

        System.out.println("\n");
        result = 0;

        for (int i = 1; i <= 10; i++) {
            result = (result + i);
            if (i < 10) {
                System.out.printf("%d+", i);
            } else {
                System.out.printf("%d = %d", i, result);
            }

        }

        System.out.println("\n");
        result = 10;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d ", result);
            result--;
        }

        System.out.println("\n");
        result = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d ", result);
            result += 2;
        }

        System.out.println("\n");
        result = 0;

        for (int i = 1; i <= 10; i++) {
            result += 2;
            System.out.printf("%d ", result);
        }

        System.out.println("\n");
        result = 1;

        for (int i = 1; i <= 10; i++) {
            result = i * i;
            System.out.printf("%d ", result);
        }

        System.out.println("\n");
        result = 1;

        for (int i = 1; i <= 10; i++) {
            result = i * i;
            System.out.printf("%d ", result);
        }
        System.out.println("\n");
        result = 1;

        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d Even %n", i);
            } else {
                System.out.printf("%d Odd %n", i);
            }
        }
    }
}
