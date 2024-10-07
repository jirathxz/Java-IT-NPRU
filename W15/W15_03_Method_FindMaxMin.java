package W15;

public class W15_03_Method_FindMaxMin {
    // 1) Method สำหรับหาค่ามากที่สุด
    static int GetMax(int n1, int n2) {
        int res = 0;
        if(n1 > n2)
        {
            res = n1;
        } else if (n2 > n1) {
            res = n2;
        }
        return res;
    }

    // 2) Method สำหรับหาค่าน้อยที่สุด
    static int GetMin(int n1, int n2) {
        int res = 0;
        if(n1 < n2)
        {
            res = n1;
        } else if (n2 < n1) {
            res = n2;
        }
        return res;
    }

    // 3) Method สำหรับหาค่ามากที่สุด โดยรับค่า 3 ตัว
    static int GetMaxThree(int n1, int n2, int n3) {
        int res = 0;
        if(n1 > n2 && n1 > n3)
        {
            res = n1;
        } else if (n2 > n1 && n2 > n3) {
            res = n2;
        } else if (n3 > n1 && n3 > n2) {
            res = n3;
        }
        return res;
    }

    // 4) Method สำหรับหาค่าน้อยที่สุด โดยรับค่าเป็น array
    static int GetMinArray(int arr[]) {
        int res = arr[0];
        for (int i = 0; i < arr.length; i++)
            res = Math.min(res, arr[i]);
        return res;
    }
    // 5) Method สำหรับแสดงค่าใน array ทั้งหมด
    static int GetArray(int arr[]) {
        int res = arr[0];
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ", ");
        return res;
    }
    public static void main(String[] args) {

        int num[] = { 1, 5, 99, 7 };
        System.out.println("ค่าที่มากที่สุด: " + GetMax(55, 77)); 
        System.out.println("ค่าที่น้อยที่สุด: " + GetMin(68, 1002)); 
        System.out.println(GetMaxThree(5, 10, 1));
        System.out.println("ค่า Array ที่น้อยที่สุด: " + GetMinArray(num)); 
        System.out.println(GetArray(num)); 
    }
}
