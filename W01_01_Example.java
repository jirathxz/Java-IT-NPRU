import java.util.Scanner;

public class W01_01_Example {
    public static void main(String[] args) {
        int point = 0;
        Scanner type = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.print("[Point: " + String.valueOf(point) + "] Type Some Text: ");
            String output = type.nextLine();

            switch (output) {
                case "studentid": {
                    int score = 10;
                    point = point + score;
                    System.out.println("Answer: 674230013");
                    System.out.println("Your Point +" + String.valueOf(score));
                    break;
                }

                case "name": {
                    int score = 5;
                    point = point + score;
                    System.out.println("Answer: ji");
                    System.out.println("Your Point +" + String.valueOf(score));
                    break;
                }

                case "exit": {
                    System.out.println("Now is exit");
                    loop = false;
                    type.close();
                    break;
                }

                default: {
                    System.out.println("Nothing Event");
                }
            }
        }
    }
}