import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        PasswordChecker passwordChecker = new PasswordChecker();

        logger.info("Enter your password: ");

        String password = scanner.nextLine();

        System.out.println(passwordChecker.passwordIsOk(password));

        passwordChecker.passwordIsValid(password);


    }
}