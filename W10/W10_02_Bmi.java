package W10;

import java.util.Scanner;

public class  W10_02_Bmi {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("\u001B[33m>> \u001B[30mEnter Your Weight (kg): ");
        double weight = kb.nextDouble();
        System.out.print("\u001B[34m>> \u001B[30mEnter Your Height (cm): ");
        double heightCM = kb.nextDouble();
        
        double heightM = heightCM * 0.01;
        System.out.printf("Your Height is %f M%n", heightM);
        double bmi = weight / (heightM * heightM);

        if(bmi <= 18.4)
        {
            System.out.printf("You Height is Underweight (%f BMI)", bmi);
        } else if(bmi >= 18.5 && bmi <= 24.9)
        {
            System.out.printf("You Height is Normal (%f BMI)", bmi);
        } else if(bmi >= 25.0 && bmi <= 39.9) {
            System.out.printf("You Height is Overweight (%f BMI)", bmi);
        } else {
            System.out.printf("You Height is Obese (%f BMI)", bmi);
        }
    }
}