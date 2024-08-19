package W10;

import java.util.Scanner;

public class W10_03_Login {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        final String username = "jirathx";
        final String password = "123";
        boolean loggedOn = false;
        try {
            while(true)
            {
                
                if(loggedOn) return;

                System.out.print("\u001B[33m>> Type a username: \u001B[30m");
                String usernameInput = kb.nextLine();
                System.out.print("\u001B[33m>> Type a password: \u001B[30m");
                String passwordInput = kb.nextLine();

                if(usernameInput.equals(username) && passwordInput.equals(password))
                {
                    System.out.printf("\u001B[32mNow Your Loggged To Account %s!!\u001B[30m %n",  username);
                    loggedOn = true;
                } else {
                    if(!usernameInput.equals(username) && !passwordInput.equals(password))
                    {
                        System.out.printf("\u001B[31m[Error Code 03] Username And Password Incorrect..\u001B[30m %n");
                    } else {
                        if(!usernameInput.equals(username))
                        {
                            System.out.printf("\u001B[31m[Error Code 01] Username Incorrect..\u001B[30m %n");
                        }

                        if(!passwordInput.equals(password))
                        {
                            System.out.printf("\u001B[31m[Error Code 02] Password Incorrect..\u001B[30m %n");
                        }
                    }
                }
            }
        } finally {
            System.out.println("\n\u001B[35mGOOD BYE :)\u001B[30m\n");
        }
    }
}