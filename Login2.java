package les12;

import java.util.Scanner;

public class Login2 {
    final int NUMBERS_HOURS_IN_DAY = 24;
    final static int MAX_LOGIN_ATTEMPTS = 3;
    int numberAttempts;

    static boolean inloggen(String username, String password) {
        if (username.equals("Jack") && password.equals("JacPassword")) {
            System.out.println("You are logged in!");
            return true;
        }
        else {
            System.out.println("Your data is not correct!");
            return false;
        }
    }

    public static void main (String[] args) {
        Login2 login = new Login2();
        Scanner scanner = new Scanner(System.in);

        while (login.numberAttempts < MAX_LOGIN_ATTEMPTS) {
            login.numberAttempts ++;

            System.out.println("Login Attempt " + login.numberAttempts);

            System.out.println("Enter username: ");
            String username = scanner.nextLine();

            System.out.println("Enter password: ");
            String password = scanner.nextLine();

            if (inloggen(username, password)) {
                break;
            }
        }
        if (login.numberAttempts >= MAX_LOGIN_ATTEMPTS) {
            System.out.println("Maximum login attempts reached.");
        }
        scanner.close();
    }
}
