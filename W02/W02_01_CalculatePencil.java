package W02;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class W02_01_CalculatePencil {
    public static void main(String[] args){

        // ข้อมูล (input) (0 = กล่อง 1 = ดินสอ)
        int[] input = {3, 12};
        
        // ขบวณการณ์ (process)
        String[] text = {"จำนวณดินสอทั้งหมด ", " แท่ง"};
        int process = input[1] * input[0];
        
        // ค่าที่ได้ (output)
        String output = text[0] + String.valueOf(process) + text[1];

        // แสดงผลค่า (print)
        System.out.println(output);

        // แสดงผลแบบ Alert Dialog
        Font thaiFont = loadThaiFont();

        UIManager.put("OptionPane.messageFont", thaiFont);

        JOptionPane.showMessageDialog(null, output, "Calculate Pencil", JOptionPane.INFORMATION_MESSAGE);
    }

    private static Font loadThaiFont() {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font[] fonts = ge.getAllFonts();

        for (Font font : fonts) {
            if (font.canDisplay('\u0E01')) { 
                return font.deriveFont(Font.PLAIN, 24); 
            }
        }

        return new Font("Arial", Font.PLAIN, 24);
    }

}   
