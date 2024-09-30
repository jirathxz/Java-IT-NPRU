package W14;

import java.util.*;

public class W14_01_Array_SumNumber {
    public static void Table() {
        System.out.println("\n+==============================+\n");
    }

    public static void ShowAllArray(String text, int arr[]) {
        StringBuilder gArr = new StringBuilder(); 
        for (int i = 0; i < arr.length; i++) {
            gArr.append(arr[i] + " ");
        }
        
        System.out.println(text + " " + gArr.toString());
    }

    public static int GetMergeArray(int arr[]) {
        int summary = 0;
        for (int i = 0; i < arr.length; i++) {
            summary += arr[i];
        }
        return summary;
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int numbers[] = { 10, 30, 17, 9, 31, 225, 64, 89, 5, 120 };

        Table();

        // แสดงข้อมูล Array ทั้งหมด
        ShowAllArray("Data in array are:", numbers);
        Table();

        // หาผลรวมข้อมูลทั้งหมด
        System.out.println("Data All Merge is: " + GetMergeArray(numbers));

        // สร้าง Array ใหม่เพื่อรับค่าข้อมูลตัวเลข 5 ตัว
        Table();
        int num[] = new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.printf("Enter Array Number [Index: %d]: ", i);
            num[i] = kb.nextInt();
        }

        // แสดงข้อมูล Array ใหม่ | หาผลรวม Array ใหม่
        
        Table();

        ShowAllArray("Summary User Array: ", num);
        System.out.println("Result Merge User Array: " + GetMergeArray(num));

        // ปิด Scanner
        kb.close();
    }
}
