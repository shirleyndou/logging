import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PasswordChecker {

    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public void passwordIsValid(String password) {

        if (!exist(password)) { //checks if password does not exist
            logger.info("1. Password should exist");
        }
        if (!longer(password)) { //checks if password is longer that 8 characters
            logger.info("2. Password should be longer than 8 characters");
        }
        if (!lowerCase(password)) { //checks if password has at least one lower case char
            logger.info("3. Password should have at least one lowercase letter");
        }
        if (!upperCase(password)) { //checks if password has a least one upper case char
            logger.info("4. Password should have at least one uppercase letter");
        }
        if (!digit(password)) { //checks if password has at least 1 digit
            logger.info("5. Password should at least have one digit");
        }
        if (!character(password)) { //checks if password has at least one special char
            logger.info("6. Password should have at least one special character");
        }
    }

    public boolean passwordIsOk(String password) {
        /*
        * This function checks/counts if all the conditions of the password are met
        *But at least 3 of the conditions should be met
        *  */
        int counter = 0;

        if (exist(password)) {
            counter++;
        }
        if (longer(password)) {
            counter++;
        }
        if (lowerCase(password)) {
            counter++;
        }
        if (upperCase(password)) {
            counter++;
        }
        if (digit(password)) {
            counter++;
        }
        if (character(password)) {
            counter++;
        }

        if (!(exist(password) && longer(password))) { //checks if condition 1 and 2 are met because password is never OK if conditions 1 and 2 are not met.
            logger.error("Password is never okay if condition 1 and 2 are not met.");
        }

        return counter >= 3;
    }

    /*Function that passes when the password exists*/
    boolean exist(String password) {
        return password.length() >= 1;
    }

    /*Function that passes when the password is longer than 8 chars*/
    boolean longer (String password) {
        return password.length() >= 8;
    }

    /*Function passes when the password has at least 1 lower case*/
    boolean lowerCase (String password) {
        for (int i =0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /*Function passes when the password has at least 1 upper case*/
    boolean upperCase (String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /*Function passes when the password has at least 1 digit case*/
    boolean digit (String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /*Function passes when the password has at least 1 special char*/
    boolean character (String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
