package W13;

public class W13_01_IntroArray {
    public static void main(String[] args) {
        Line(); // เส้นคั้น

        ForColor(); // สี

        Line();

        ForBanknotes(); // แบงค์
        
        Line(); // เส้นคั้น

        ForAlphabet(); // Alphabet

        Line(); // เส้นคั้น
    }

    public static void ForColor() {
        String[] colors = {"\u001B[31mRed", "\u001B[33mOrange", "Yellow", "\u001B[32mGreen", "\u001B[34mBlue", "\u001B[35mPurple", "\u001B[37mPink"};

        for(int i = 0; i < colors.length; i++)
        {
            String message = (i < 1) ? "The First Color is " : (i == colors.length) ? "The Last Color is " : "- ";
            printf("%s%s%n\u001B[37m", message, colors[i]);
        }

        println("\n--Reverse--\n");

        for(int i = colors.length-1; i >= 0; i--)
        {
            String message = (i < 1) ? "The First Color is " : (i == colors.length) ? "The Last Color is " : "- ";
            printf("%s%s%n\u001B[37m", message, colors[i]);
        }
    }

    public static void ForBanknotes() {
        int[] banknotes = {20, 50, 100, 500, 1000};

        for(int i = 0; i < banknotes.length; i++)
        {
            String message = (i < 1) ? "The First Banknote is " : "- ";
            printf("%s%s%n", message, banknotes[i]);
        }
    }

    public static void ForAlphabet() {
        char[] alphabet = {'A', 'E', 'C', 'O', 'U'};

        for(int i = 0; i < alphabet.length; i++)
        {
            String message = (i < 1) ? "The First Alphabet is " : (i == 2) ? "The Third Alphabet is " : "- ";
            printf("%s%s%n", message, alphabet[i]);
        }
    }

    public static void Line() {
        System.out.println("\n|------------------------------|\n");
    }


    // ย่อคำสั่ง print 
    public static void printf(String text, Object... args){ System.out.printf(text, args); }
    public static void print(String text){ System.out.print(text); }
    public static void println(String text){ System.out.println(text); }
}
