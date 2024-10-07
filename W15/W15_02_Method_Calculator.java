package W15;

public class W15_02_Method_Calculator {
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
        System.out.println("นำมาบวก: " + CalculatorAdd(1, 2));
        System.out.println("นำมาลบ: " + CalculatorSubtract(7, 6));
        System.out.println("นำมาคูณ: " + CalculatorMultiply(10, 10));
        System.out.println("นำมาหาร: " + CalculatorDivide(20, 2));
    } 
}
