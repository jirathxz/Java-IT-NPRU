import java.util.Scanner;

public class W01_01_Special {
    public static void main(String[] args) {
        int point = 0;
        Scanner type = new Scanner(System.in);
        boolean loop = true;
        while (loop) {

            System.out.print("[Point: " + String.valueOf(point) + "] Type Some Text: ");
            String output = type.nextLine();

            if (point == 40) {
                System.out.println("YOUR MAX SCORE!!!!");
                loop = false;
                type.close();
            }

            switch (output) {
                case "week": {
                    int score = 10;
                    point = point + score;
                    System.out.println("this is a week 1");
                    System.out.println("Your Point +" + String.valueOf(score));
                    break;
                }
                case "day": {
                    int score = 10;
                    point = point + score;
                    System.out.println("this is a day 1");
                    System.out.println("Your Point +" + String.valueOf(score));
                    break;
                }

                case "hello": {
                    int score = 5;
                    point = point + score;
                    System.out.println("Java!!");
                    System.out.println("Your Point +" + String.valueOf(score));
                    break;
                }

                case "studentid": {
                    int score = 10;
                    point = point + score;
                    System.out.println("Student IDD: 674230013");
                    System.out.println("Your Point +" + String.valueOf(score));
                    break;
                }

                case "name": {
                    int score = 5;
                    point = point + score;
                    System.out.println("Name: ji");
                    System.out.println("Your Point +" + String.valueOf(score));
                    break;
                }

                case "exit": {
                    System.out.println("Now is Back To Basic");
                    loop = false;
                    type.close();
                    break;
                }

                default: {
                    System.out.println("Nothing Event");
                }
            }
        }
        System.out.println("Hello Java");

        switch (point) {
            case 5: {
                System.out.println("Your Score is: OK");
            }

            case 10: {
                System.out.println("Your Score is: Nice");
            }

            case 20: {
                System.out.println("Your Score is: Great");
            }

            case 30: {
                System.out.println("Your Score is: Pretty Good");
            }

            case 40: {
                System.out.println("Your Score is: Good Work");
            }
        }
    }
}
