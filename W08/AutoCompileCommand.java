package W08;

import java.util.*;

public class AutoCompileCommand {
        public static void main(String[] args) {
                Scanner kb = new Scanner(System.in);
                try {
                        System.out.println("\n--- AUTO PACKAGE COMMAND ---\n");
                        System.out.println("By \u001B[034mjirathx.\u001B[030m");
                        System.out.println("** Simple is [ W08 ] \n");
                        System.out.print(">> Enter Package Name: ");
                        String filePackage = kb.nextLine();
                        System.out.println(
                                        "** Simple is [ W08_01_Next_NextLine ] \u001B[033m[ Without .java ]\u001B[030m");
                        System.out.print(">> Enter File Name: ");
                        String file = kb.nextLine();
                        System.out.printf("%n%n\u001B[032mCMD = javac %s\\%s.java && java %s.%s%n", filePackage, file,
                                        filePackage,
                                        file);
                        System.out.printf("PowerShell = javac %s\\%s.java; java %s.%s\u001B[030m%n%n", filePackage,
                                        file,
                                        filePackage,
                                        file);
                } finally {
                        kb.close();
                }

        }

}
