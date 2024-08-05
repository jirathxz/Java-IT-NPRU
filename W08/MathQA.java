package W08;

import java.util.*;

public class MathQA {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random rand = new Random();
        while (true) {
            try {
                int num1 = rand.nextInt(100), num2 = rand.nextInt(100);
                char op = switch (rand.nextInt(4)) {
                    case 1 -> '+';
                    case 2 -> '-';
                    case 3 -> '*';
                    case 4 -> '/';
                    default -> '+';
                };

                int correct = switch (op) {
                    case '+' -> num1 + num2;
                    case '-' -> num1 - num2;
                    case '*' -> num1 * num2;
                    case '/' -> num2 != 0 ? num1 / num2 : 0;
                    default -> 0;
                };

                System.out.printf("\u001B[034mQuestion is %s %c %s = \u001B[030m", num1, op, num2);

                System.out.println((kb.nextInt() == correct) ? "\u001B[032mCorrect!!\u001B[030m"
                        : "\u001B[031mIncorrect..\u001B[030m");

            } catch (InputMismatchException e) {
                System.out.println("\u001B[031mPlease type a number, do not type anything else..\u001B[030m");
                kb.nextInt();
            } catch (NoSuchElementException e) {
                System.out.println("[You leave answer]");
                System.out.println("See you next time :)");
                break;
            }
        }

        kb.close();
    }
}