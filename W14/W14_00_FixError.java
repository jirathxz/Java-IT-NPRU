package W14;

public class W14_00_FixError {
    public static void main(String[] args) {
        int i = 3;
        int a[] = {0, 2, 4, 6, 8, 1, 3, 5, 7, 9};
        System.out.println(a[0] + a[6]);
        System.out.println(a[1] * --a[4]);
        System.out.println(a[9]++);
        // System.out.println(a[9] + a[4]);
        System.out.println("Error");
        System.out.println(a[1]++ + a[0]);
        System.out.println(a[5 + 3]);
        System.out.println(--a[2*i] + a[1]++);
        System.out.println(a[1] + a[4] + a[9]);
    }
}
