package W05;

import java.util.Scanner;

public class W05_02_ifElseif_PosNegZero {
    public static void main(String[] args) {
        // รับค่าจากแป้นพิมพ์
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter The Output: ");
        int number = kb.nextInt();

        // หากว่า numberมีค่า - เชิงบวก
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) { // หากว่า numberมีค่า - เชิงลบ
            System.out.println("Nagative");
        } else if (number == 0) { // หากว่า numberมีค่า - เท่ากับ 0
            System.out.println("Zero");
        } else {
            System.out.println("Invalid Input");
        }

        kb.close();
    }
}
