package W02;

public class W02_01_Homework {
    public static void main(String[] args){

        // ข้อมูล (input) (0 = เสื้อ 1 = กางเกง 3 = เงินที่เหลือ)
        int[] input = {300, 250, 350};
        
        // ขบวณการณ์ (process)
        String[] text = {"รินรินมีเงิน ", " บาท"};
        int process = input[0] + input[1] + input[2];
        
        // ค่าที่ได้ (output)
        String output = text[0] + String.valueOf(process) + text[1];

        // แสดงผลค่า (print)
        System.out.println(output);
    }

}   
