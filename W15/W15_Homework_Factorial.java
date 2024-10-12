package W15;

import java.util.*;
/**
 * W15_Homework_Factorial
 */
public class W15_Homework_Factorial {
    static void BorderLine()
    {
        System.out.println("\nx-----------------------x");
    }

    static void GetFactorial(int num)
    {
        int time = 0;
        int res = 1;
        BorderLine();
        for(int i = 1; i <= num; i++)
        {
            res = res*i;
            
            time++;
            if(time >= num)
            {
                System.out.printf("%d = %d", i, res);
            } else {
                System.out.printf("%d x ", i);
            }
        }
        System.out.printf("%n> Factorial of %d is %d", num, res);
        BorderLine();
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int fac = 0;
        System.out.println("-- Calculator Factorial --");
        do {
            try {
                System.out.print("> Enter a number: ");
                fac = kb.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("> Invalid input. Please enter a valid number.");
                kb.next(); 
            }
        } while (fac == 0);
        GetFactorial(fac);
        kb.close();
    }
}