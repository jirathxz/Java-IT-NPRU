package W12;

import java.util.*;

public class W12_02_WhileTrue {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int targetNum = kb.nextInt();
        int time = 0;
        while(true)
        {
            if(targetNum < 1) break;
            time++;
            System.out.println("Loop Time: " + time);
            if(time >= targetNum) break;
        }
        kb.close();
    }
}
