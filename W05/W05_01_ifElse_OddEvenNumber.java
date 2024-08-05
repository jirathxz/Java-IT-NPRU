package W05;

import java.util.Scanner;

public class W05_01_ifElse_OddEvenNumber {
    public static void main(String[] args) {
        // ตัวแปร -------------------------------------|

        /* ดึง Scanner มาใช้ */
        Scanner kb = new Scanner(System.in);

        /* รับค่าจากผู้ใช้ */
        System.out.print("Enter a number: ");
        int number = kb.nextInt();

        /* หาเศษ */
        int result = number % 2;

        // เช็คค่า Even & Odd All Case--------------------------|
        System.out.println("Case 1 --------------\n\n");
        if (result == 0) {
            System.out.println(number + " is Number is Even");
        } else {
            System.out.println(number + " is Number is Odd");
        }
        System.out.println("\n\nCase 2 --------------\n\n");
        if (result == 1) {
            System.out.println(number + " is Number is Odd");
        } else {
            System.out.println(number + " is Number is Even");
        }
        System.out.println("\n\nCase 3 --------------\n\n");
        if (result != 0) {
            System.out.println(number + " is Number is Odd");
        } else {
            System.out.println(number + " is Number is Even");
        }
        System.out.println("\n\nCase 4 --------------\n\n");
        if (result != 1) {
            System.out.println(number + " is Number is Even");
        } else {
            System.out.println(number + " is Number is Odd");
        }

        // ปิดการรับค่าจาก Keyboard --------------------|
        kb.close();
    }
}