package W15;

public class W15_01_Method_Intro {
    // 1) Method ที่ไม่มีการรับค่าและคืนค่า

    public static void NoInputNoOutput() {
        System.out.println("ไม่มีการรับค่าและคืนค่า");
    }

    // 2) Method ที่รับค่าและไม่คืนค่า 
    public static void InputNoOutput(String text) {
        System.out.println(text);
    }

    // 3) Method ที่ไม่รับค่าและคืนค่า
    public static String OutputNoInput() {
        return "ที่ไม่รับค่าและคืนค่า";
    }
    // 4) Method ที่รับค่าและคืนค่า
    public static String InputOutput(String text) {
        return text;  
    }

    // 5) Method เส้นแบ่ง ที่ไม่มีการรับค่าและคืนค่า
    public static void BorderLine()
    {
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        // 1
        NoInputNoOutput();
        // 2
        InputNoOutput("ที่รับค่าและไม่คืนค่า");
        // 3 
        System.out.println(OutputNoInput());
        // 4
        System.out.println(InputOutput("ที่รับค่าและคืนค่า"));
        // 5
        BorderLine();
    }
}
