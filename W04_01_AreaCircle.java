import java.util.Scanner;

public class W04_01_AreaCircle_Homework {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("\n\nEnter Radius: ");

        double radius = inputUser.nextDouble(); // กำหนดค่า Radius
        double areaMath = Math.PI * radius * radius; // การคำนวณแบบใช้ Math.PI
        double manualPI = 3.14159; // การคำนวณแบบ Manual
        double areaManual;

        if (radius > 0) {   
            areaManual = manualPI * radius * radius;
            System.out.println("\n| Area Radius | Area Manual | \s\s\s\s\s\s\s\sArea\s\s\s\s\s\s\s\s |\n");
            System.out.println("\s\s\s\s\s" + radius + "\s\s\s\s\s\s\s\s\s" + areaManual + "\s\s\s\s\s\s" + areaMath);
            System.out.println("\n-----------------------------------------------------");
            System.out.println("    _ _           _   _          \r\n" +
                    "   (_|_)         | | | |         \r\n" +
                    "    _ _ _ __ __ _| |_| |__ __  __\r\n" +
                    "   | | | '__/ _` | __| '_ \\\\ \\/ /\r\n" +
                    "   | | | | | (_| | |_| | | |>  < \r\n" +
                    "   | |_|_|  \\__,_|\\__|_| |_/_/\\_\\\r\n" +
                    "  _/ |                           \r\n" +
                    " |__/                            ");
        } else {
            System.out.println("Error: Please Enter The Radius Geather Than 1");
        }

        inputUser.close();
    }
}