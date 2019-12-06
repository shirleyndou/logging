import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String password;

        PasswordChecker ps= new PasswordChecker();

        logger.info("Enter your password: ");

        //System.out.println("Enter your password: "); //log info
        password = scan.nextLine();
        ps.passwordIsValid(password);
    }
}
