package W12;

import java.util.*;

/**
 * W12_04_DoWhile_SelectMenu
 */
public class W12_04_DoWhile_SelectMenu {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int choose;
        int firstNumber;
        int secondNumber;

        do {
            System.out.println("All Choose");
            System.out.println("\n1. Addtive Number");
            System.out.println("2. Subtract Number");
            System.out.println("3. Exit");

            System.out.print("\n\u001B[35mEnter Your Choose: \u001B[37m");
            choose = kb.nextInt();

            switch (choose) {
                case 1:
                    System.out.print("\u001B[33m>> Enter First Number: \u001B[37m");
                    firstNumber = kb.nextInt();

                    System.out.print("\u001B[33m>> Enter Second Number: \uu001B[37m");
                    secondNumber = kb.nextInt();

                    System.out.println("\n\uu001B[35mResult is " + (firstNumber + secondNumber) + "\u001B[37m");
                    break;

                case 2:
                    System.out.print("\u001B[33m>> Enter First Number: \u001B[37m");
                    firstNumber = kb.nextInt();

                    System.out.print("\u001B[33m>> Enter Second Number: \uu001B[37m");
                    secondNumber = kb.nextInt();
                    
                    System.out.println("Result is " + (firstNumber - secondNumber));
                    break;
                case 3:
                    System.out.println("\uu001B[32mGoodbye see you again tomorrow next day on other time\uu001B[37m");
                default:
                    System.out.println("\u001B[31mInvaild choice, Please try againu\u001B[37m");
                    break;
            }
        } while (choose != 3);
        kb.close();
    }
}