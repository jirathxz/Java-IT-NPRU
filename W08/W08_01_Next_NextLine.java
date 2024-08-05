package W08;

import java.util.*;

public class W08_01_Next_NextLine {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Your Name1 : ");
        String name1 = kb.nextLine();
        System.out.print("Enter Your Name2 : ");
        String name2 = kb.nextLine();
        System.out.println(name1 + "" + name2);
        kb.close();
    }

    public static String CallName() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Your Name2 : ");
        String name1 = kb.nextLine();
        kb.close();
        return name1;
    }
}