package W15;

import java.util.*;

public class W15_Homework_Gender {
    enum GENDER {
        MALE,
        FEMALE
    }

    static void BorderLine() {
        System.out.println("\nx-------------x\n");
    }

    static String SelectGender(GENDER g) {
        String res = (g == GENDER.MALE) ? "Male" : (g == GENDER.FEMALE) ? "Female" : "Unknown";
        return res;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int ch = 0;
        System.out.println("-- Choose Your Gender --\n1. Male\n2. Female");
        do {
            try {
                System.out.print("> Choose Your Gender: ");
                ch = kb.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("> Please Type Between 1, 2");
                System.out.print("> Choose Your Gender: ");
                ch = kb.nextInt();
            }
        } while (ch < 1);
        switch (ch) {
            case 1:
                BorderLine();
                System.out.println("You Choose " + SelectGender(GENDER.MALE));
                break;
            case 2:
                BorderLine();
                System.out.println("You Choose " + SelectGender(GENDER.FEMALE));
                break;

            default:
                break;
        }
        
        BorderLine();
        kb.close();
    }
}
