package W14;

public class W14_02_Array_Gender {
    public static void main(String[] args) {
        String[] name = { "นายสมชาย", "นางสมใจ", "นางสาวสมนึก", "นายสมดี", "นางสาวสมฤทัย" };
        String[] codes = { "123TH", "124EN", "125EN", "126TH", "127EN" };
        int countMale = 0;
        int countFemale = 0;

        // 1 แสดงจำนวนนักเรียนทั้งหมด
        System.out.println("Student Count: " + name.length);

        // 2 แสดงเฉพาะชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาย" [startsWith()]
        // และมีจำนวนนักเรียนเท่ากับกี่คน
        System.out.println("- ALL MALE STUDENT\n");
        for (int i = 0; i < name.length; i++) {
            if (name[i].startsWith("นาย")) {
                System.out.println(name[i]);
                countMale++;
            }
        }

        // เช็คจำนวน
        System.out.println("\nMale Student Have: " + countMale);

        // 3 แสดงเฉพาะชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาง" [startsWith()]
        // และมีจำนวนนักเรียนเท่ากับกี่คน
        System.out.println("\n- ALL FEMALE STUDENT\n");
        for (int i = 0; i < name.length; i++) {
            if (name[i].startsWith("นาง")) {
                System.out.println(name[i]);
                countFemale++;
            }
        }

        // 4. แสดงชื่อทุกคน
        System.out.println("\n- ALL STUDENTS GENDER");
        for (int i = 0; i < name.length; i++) {
            if (name[i].startsWith("นาย")) {
                System.out.println(name[i] + " เป็นเพศชาย");
            }
        }
        for (int i = 0; i < name.length; i++) {
            if (name[i].startsWith("นาง")) {
                System.out.println(name[i] + " เป็นเพศหญิง");
            }
        }
        System.out.println("\nAll Of Student is: " + (countMale + countFemale));

        // 5. แสดงลำดับ
        System.out.println("\n- Sort Number Of Students");
        for (int i = 0; i < name.length; i++) {
            System.out.println((i + 1) + ": " + name[i] + " เป็นเพศชาย");
        }
        System.out.println("\n- Sort Number Of Male Student");
        for (int i = 0; i < name.length; i++) {
            if (name[i].startsWith("นาย")) {
                System.out.println((i + 1) + ": " + name[i]);
            }
        }
        System.out.println("\n- Sort Number Of Female Student");
        for (int i = 0; i < name.length; i++) {
            if (name[i].startsWith("นาง")) {
                System.out.println((i + 1) + ": " + name[i] + " เป็นเพศหญิง");
            }
        }
    }
}
