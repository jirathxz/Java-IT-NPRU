package W08;

import java.util.Scanner;

public class W08_02_InputFromKeyboard2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter your ID : ");
        long id = kb.nextLong();

        System.out.print("Enter your name and surname : ");
        String name = kb.next();
        String surname = kb.next();

        System.out.print("Enter your age : ");
        int age = kb.nextInt();

        System.out.print("Enter your GPA : ");
        double gpa = kb.nextDouble();

        System.out.printf("ID: %d Name: %d Surname: %d Age: %d GPA: %d", id, name, surname, age, gpa);
        kb.close();
    }
}