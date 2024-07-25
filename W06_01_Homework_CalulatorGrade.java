import java.util.Scanner;

public class W06_01_Homework_CalulatorGrade {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner kb = new Scanner(System.in);
        final int nameWidth = 20, scoreWidth = 10, gradeWidth = 10;
        int maxScore = 100;
        String name = "Jiramate Thongpleaw";
        int gradeA = (maxScore * 80) / 100, gradeB = (maxScore * 70) / 100, gradeC = (maxScore * 60) / 100, gradeD = (maxScore * 50) / 100;
        boolean cal = true;
        while (loop) {
            println("\033[0;32m+- Calulator Grade -+\n");
            println("1. Let's Calulate!\033[0;0m");
            println("2. Configure");
            println("2. Exit");
            print("\n>> Enter Choice: ");
            int choice = kb.nextInt();
            nextLine();
            switch (choice) {
                case 1:
                    print("\033[0;32m[Select] You Choose Calculate!!\033[0;0m \n");
                    while (cal) {
                        print("\n\0- Type Ctrl+C To Exit");
                        print("\n\033[0;32m>> Enter Score: \033[0;0m");
                        int score = kb.nextInt();
                        nextLine();
                        if (score < 0 || score > maxScore) {
                            print("\033[0;31m[Error] Please enter a value between 0 and " + maxScore + "\033[0;0m \n");
                        } else {
                            String grade = (score >= gradeA) ? "A" : (score >= gradeB) ? "B" : (score >= gradeC) ? "C" : (score >= gradeD) ? "D" : "E";
                            printf("\033[36m+-%-" + nameWidth + "s-+-%-" + scoreWidth + "s-+-%-" + gradeWidth+ "s-+%n\033[0m", repeat("-", nameWidth), repeat("-", scoreWidth), repeat("-", gradeWidth));
                            printf("| %-" + nameWidth + "s | %-" + scoreWidth + "s | %-" + gradeWidth + "s |%n", "Name", "Score", "Grade");
                            printf("\033[36m+-%-" + nameWidth + "s-+-%-" + scoreWidth + "s-+-%-" + gradeWidth + "s-+%n\033[0m", repeat("-", nameWidth), repeat("-", scoreWidth), repeat("-", gradeWidth));
                            printf("| %-" + nameWidth + "s | %-" + scoreWidth + "s | %-" + gradeWidth + "s |%n", name, score, grade);
                            printf("\033[36m+-%-" + nameWidth + "s-+-%-" + scoreWidth + "s-+-%-" + gradeWidth + "s-+%n\033[0m", repeat("-", nameWidth), repeat("-", scoreWidth), repeat("-", gradeWidth));
                        }
                    }
                    break;
                case 2:
                    print("\033[0;32m[Select] You Choose Configure\033[0;0m \n");
                    print("\n\033[0;32m>> [" + maxScore + "] Max Score = \033[0;0m");
                    int setScore = kb.nextInt();
                    maxScore = setScore;
                    gradeA = (maxScore * 80) / 100;
                    gradeB = (maxScore * 70) / 100; 
                    gradeC = (maxScore * 60) / 100;
                    gradeD = (maxScore * 50) / 100;
                    nextLine();
                    print("\033[0;32m[Config] Max Score A change to " + setScore + "\033[0;0m\n");
                    print("\033[0;32m[Config] Grade A = " + gradeA + "\033[0;0m\n");
                    print("\033[0;32m[Config] Grade B = " + gradeB + "\033[0;0m\n");
                    print("\033[0;32m[Config] Grade C = " + gradeC + "\033[0;0m\n");
                    print("\033[0;32m[Config] Grade D = " + gradeD + "\033[0;0m\n");
                    nextLine();
                    break;
            }
        }
        kb.close();

    }

    /* ทำให้สคริปส์อ่านง่ายขึ้น */
    public static void print(String s) {
        System.out.print(s);
    }

    public static void println(String s) {
        System.out.println(s);
    }

    public static void printf(String format, Object... args) {
        System.out.printf(format, args);
    }

    public static void nextLine() {
        System.out.println("");
    }

    private static String repeat(String str, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}