package W13;
import java.util.*;
public class W13_02_IntroArray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String[] brand = new String[3];
        brand[0] = "Nissan";
        brand[1] = "Toyota";
        brand[2] = "Honda";

        for(int i = 0; i < brand.length; i++)
        {
            printf("Enter Name Brand %d: ", i);
            brand[i] = kb.nextLine();
        }

        // brand[10] = "Tesla";
        println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        for(String i : brand)
        {
            printf("%s / ", i);
        }
        println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        kb.close();
    }

    // ย่อคำสั่ง print
    public static void printf(String text, Object... args) {
        System.out.printf(text, args);
    }

    public static void print(String text) {
        System.out.print(text);
    }

    public static void println(String text) {
        System.out.println(text);
    }
}
