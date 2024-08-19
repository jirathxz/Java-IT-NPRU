package W10;
import java.util.Scanner;

public class W10_04_TitleStatus {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print(">> Enter a gender: ");
        String gender  = kb.next();

        System.out.print(">> Enter a age: ");
        int age  = kb.nextInt();

        System.out.print(">> Enter a vowel (No / Yes): ");
        String married  = kb.next();

        if(gender.equalsIgnoreCase("Male"))
        {
            if(age >= 18)
            {
                System.out.println("You are Mr.");
            } else {
                System.out.println("You are Master.");
            }
        } else if(gender.equalsIgnoreCase("Female")) {
            if(age >= 18)
            {
                System.out.println("You are Mrs.");
            } else {
                System.out.println("You are Miss.");
            }
        } else {
            System.out.printf("You are %s%n", gender);
        }

        System.out.printf("Age is %d%n", age);

        if(married.equalsIgnoreCase("Yes"))
        {
            System.out.println("Your married");
        } else {
            System.out.println("Your single");
        }
        
    }
}