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
        
        System.out.println(text + gArr.toString());
    }

    public static int GetMergeArray(int arr[]) {
        int summary = 0;
        for (int i = 0; i < arr.length; i++) {
            summary += arr[i];
        }
        return summary;
    }

    public static void main(String[] args) {
        // Scanner

        Scanner kb = new Scanner(System.in);
        int numbers[] = { 10, 30, 17, 9, 31, 225, 64, 89, 5, 120 };

        Table();

        // 1.  แสดงข้อมูล Array ทั้งหมด

        ShowAllArray("Data in array are:", numbers);
        Table();

        // 2. หาผลรวมข้อมูลทั้งหมด

        System.out.println("Data All Merge is: " + GetMergeArray(numbers));

        // 3. สร้าง Array ใหม่เพื่อรับค่าข้อมูลตัวเลข 5 ตัว

        Table();
        int newNumbers[] = new int[5];
        for (int i = 0; i < newNumbers.length; i++) {
            System.out.printf("Enter Array Number [Index: %d]: ", i);
            newNumbers[i] = kb.nextInt();
        }

        // 4. แสดงข้อมูล Array ใหม่ | หาผลรวม Array ใหม่

        Table();

        ShowAllArray("Summary User Array: ", newNumbers);

        // 5. ผลรวมใหม่
        System.out.println("Result Merge User Array: " + GetMergeArray(newNumbers));

        // รวมทุกอย่าง
        int mergeArray[] = new int[numbers.length + newNumbers.length];
        for(int i = 0; i < numbers.length; i++)
        {
            mergeArray[i] = numbers[i];
        }

        for(int i = 0; i < newNumbers.length; i++)
        {
            mergeArray[numbers.length + i] = newNumbers[i];
        }

        ShowAllArray("ALL MERGE ARRAY: ", mergeArray);

        // ปิด Scanner
        kb.close();
    }
}
