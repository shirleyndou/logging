import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        PasswordChecker passwordChecker = new PasswordChecker();

        System.out.println("Enter your password: ");

        String password = scanner.nextLine();

        System.out.println(passwordChecker.passwordIsOk(password));

        passwordChecker.passwordIsValid(password);


    }
}