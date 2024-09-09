package W13;
import java.util.*;

public class W13_03_Array_ContOddEven {
    public static void main(String[] args) {
        Random rand = new Random();
        int totalEven = 0;
        int totalOdd = 0;
        int[] numbers = {rand.nextInt(20), rand.nextInt(20), rand.nextInt(20), rand.nextInt(20), rand.nextInt(20), rand.nextInt(20), rand.nextInt(20), rand.nextInt(20), rand.nextInt(20), rand.nextInt(20)};
        println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
        for(int i = 0; i < numbers.length; i++)
        {
            print(numbers[i] + " / ");
            if(numbers[i] % 2 == 0)
            {
                totalEven++;
            } else {
                totalOdd++;
            }
        }
        printf("%nAll Number is %s%nTotal Even is: %d%nTotal Odd is: %d", numbers.length, totalEven, totalOdd);
        println("\n\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
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
