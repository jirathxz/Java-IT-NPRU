package W12;

import java.util.*;

/**
 * W12_03_DoWhile
 */
public class W12_03_DoWhile {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int score;

        do {
            System.out.print("Enter Your Score: ");
            score = kb.nextInt();
        } while (score < 1 || score > 100);

        char grade = (score >= 80) ? 'A' : (score >= 70) ? 'B' : (score >= 60) ? 'C' : (score >= 50) ? 'D' : 'E';
        System.out.println(grade);
    }
}