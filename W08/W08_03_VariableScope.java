package W08;

public class W08_03_VariableScope {

    // Static Variable (ตัวแปรระดับคลาสที่เป็น static สามารถเข้าถึงได้โดยตรง)
    static int x = 50;

    // Instance Variables (คล้ายตัวแปรระดับคลาส แต่ต้องสร้าง instance
    // ของคลาสเพื่อเข้าถึง)
    int a = 100;
    int b = 200;

    public static void main(String[] args) {

        System.out.println("x = " + x); // เข้าถึง static variable โดยตรง

        // สร้าง instance ของคลาสเพื่อเข้าถึง instance variables
        W08_03_VariableScope obj = new W08_03_VariableScope();

        // การเข้าถึง instance variables ผ่าน object
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);

        int y = 300; // Local Variable วงจรชีวิตของตัวแปร y จะทำงานเฉพาะใน main method
        System.out.println("y = " + y);

        if (true) {
            int c = 300; // Local Variable วงจรชีวิตของตัวแปร c จะทำงานเฉพาะในบล็อกนี้เท่านั้น
            System.out.println("c = " + c);
        }

    }
}

// สรุป
// ตัวแปร Instance Variable และ Static Variable
// เป็นตัวแปรที่ถูกประกาศใช้ในระดับคลาส
// ตัวแปร Local Variable เป็นตัวแปรที่ถูกประกาศภายในบล็อกของโค้ด เช่น
// ภายในฟังก์ชัน เมธอด หรือบล็อกของเงื่อนไข
// ตัวแปร Local Variable จะมีวงจรชีวิตเฉพาะในบล็อกที่ถูกประกาศเท่านั้น
// ตัวแปร Instance Variable และ Static Variable จะมีวงจรชีวิตตามวงจรชีวิตของ
// object หรือคลาสตามลำดับ
// ตัวแปร Local Variable จะไม่สามารถเข้าถึงได้จากภายนอกบล็อกที่ถูกประกาศ