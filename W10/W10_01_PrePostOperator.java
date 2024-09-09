package W10;

public class W10_01_PrePostOperator {
    public static void main(String[] args) 
    {
        int a = 5;
        int b = ++a;
        int c = 5;
        int d = c++;
        int e = 5;
        int f = e--;
        System.out.printf("A: %d %n++B: %d %nC: %d %nD++: %d %nE: %d %nF--: %d", a, b, c, d, e, f);  
    } 
}