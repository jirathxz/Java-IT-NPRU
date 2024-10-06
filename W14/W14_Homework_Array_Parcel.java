
/**
 * W14_Homework_Array_Parcel
 */
package W14;
import java.util.*;
public class W14_Homework_Array_Parcel {
    public static void main(String[] args) {
        String[] name = { "พัสดุที่ 1", "พัสดุที่ 2", "พัสดุที่ 3", "พัสดุที่ 4", "พัสดุที่ 5" };
        String[] codes = { "123TH", "124EN", "125EN", "126TH", "127EN" };
        int countTH = 0;
        int countEN = 0;

        // 1 แสดงจำนวนนักเรียนทั้งหมด
        System.out.println("Parcel Count: " + codes.length);

        // 2 แสดงเฉพาะชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาย" [endsWith()]
        // และมีจำนวนนักเรียนเท่ากับกี่คน
        System.out.println("- ALL TH PARCEL\n");
        for (int i = 0; i < codes.length; i++) {
            if (codes[i].endsWith("TH")) {
                countTH++;
                System.out.println(codes[i]);
            }
        }

        // เช็คจำนวน
        System.out.println("\nAll TH Parcel: " + countTH);

        // 3 แสดงเฉพาะชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาง" [endsWith()]
        // และมีจำนวนนักเรียนเท่ากับกี่คน
        System.out.println("\n- ALL EN PARCEL\n");
        for (int i = 0; i < codes.length; i++) {
            if (codes[i].endsWith("EN")) {
                System.out.println(codes[i]);
                countEN++;
            }
        }

        // 4. แสดงชื่อทุกคน
        System.out.println("\n- ALL PARCEL");
        for (int i = 0; i < codes.length; i++) {
            if (codes[i].endsWith("TH")) {
                System.out.println(codes[i] + " เป็นพัสดุประเทศไทย");
            }
        }
        for (int i = 0; i < codes.length; i++) {
            if (codes[i].endsWith("EN")) {
                System.out.println(codes[i] + " เป็นพัสดุจากประเทศนอก");
            }
        }
        System.out.println("\nAll Parcel is: " + (countTH + countEN));

        // 5. แสดงลำดับ
        System.out.println("\n- Sort Number Of Parcel");
        for (int i = 0; i < codes.length; i++) {
            if (codes[i].endsWith("EN")) {
                System.out.println(codes[i] + " เป็นพัสดุจากประเทศนอก");
            } else {
                System.out.println(codes[i] + " เป็นพัสดุประเทศไทย");
            }
        }
        System.out.println("\n- Sort Number Of TH Parcel");
        for (int i = 0; i < codes.length; i++) {
            if (codes[i].endsWith("TH")) {
                System.out.println((i + 1) + ": " + codes[i] + " เป็นพัสดุประเทศไทย");
            }
        }
        System.out.println("\n- Sort Number Of EN Parcel");
        for (int i = 0; i < codes.length; i++) {
            if (codes[i].endsWith("EN")) {
                System.out.println((i + 1) + ": " + codes[i] + " เป็นพัสดุจากประเทศนอก");
            }
        }
    }
}
