package W15;

import java.util.*;

public class W15_03_Method_Calculator_KB {
    // 1) Method สำหรับบวกเลข
    public static double CalculatorAdd(double firstNum, double secondNum) {
        double output = (firstNum + secondNum);
        return output;
    }

    // 2) Method สำหรับลบเลข
    public static double CalculatorSubtract(double firstNum, double secondNum) {
        double output = (firstNum - secondNum);
        return output;
    }

    // 3) Method สำหรับคูณเลข
    public static double CalculatorMultiply(double firstNum, double secondNum) {
        double output = (firstNum * secondNum);
        return output;
    }

    // 4) Method สำหรับหารเลข
    public static double CalculatorDivide(double firstNum, double secondNum) {
        double output = (firstNum / secondNum);
        return output;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int choose = 0;
        do {
            System.out.println("- เครื่องคิดเลข");
            System.out.println("1. บวก");
            System.out.println("2. ลบ");
            System.out.println("3. คูณ");
            System.out.println("4. หาร");
            System.out.print("> ");
            choose = kb.nextInt();
        } while (choose == 0);

        switch (choose) {
            case 1:
                System.out.print("เริ่มบวก > ");
                double firstNum = kb.nextDouble();
                System.out.print("\s\s\s\s\s\s\s+\s");
                double secNum = kb.nextDouble();
                System.out.print("\s\s\s\s\s\s\s=\s" + CalculatorAdd(firstNum, secNum));
                break;
            case 2:
                System.out.print("เริ่มลบ > ");
                firstNum = kb.nextDouble();
                System.out.print("\s\s\s\s\s\s\s-\s");
                secNum = kb.nextDouble();
                System.out.print("\s\s\s\s\s\s\s=\s" + CalculatorSubtract(firstNum, secNum));
                break;
            case 3:
                System.out.print("เริ่มคูณ > ");
                firstNum = kb.nextDouble();
                System.out.print("\s\s\s\s\s\s\sx\s");
                secNum = kb.nextDouble();
                System.out.print("\s\s\s\s\s\s\s=\s" + CalculatorMultiply(firstNum, secNum));
                break;
            case 4:
                System.out.print("เริ่มหาร > ");
                firstNum = kb.nextDouble();
                System.out.print("\s\s\s\s\s\s\s÷\s");
                secNum = kb.nextDouble();
                System.out.print("\s\s\s\s\s\s\s=\s" + CalculatorDivide(firstNum, secNum));
                break;
            default:
                break;
        }
        kb.close();
    }
}
