import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {

    private static final Logger logger = LogManager.getLogger(Main.class.getName());


    public boolean passwordIsValid(String password) {
//

            try {
                if (password.length() > 7) {
                    if (passwordIsOk(password)) {
                        return true;
                    }

                } else {
                    logger.error(" Password should be 8 chars long \n consist of at least one digit \n upper case, lower case and a special character");
                    //System.out.println(" Password should be 8 chars long \n consist of at least one digit \n upper case, lower case and a special character");
                    //System.out.println("Please try again!!!");

                }

            } catch (Exception e) {
                //e.printStackTrace();
                logger.error("Please try again");
                //System.out.println("Please try again!!!");
            }
            return false;
    }


    public boolean passwordIsOk(String password) {

        Pattern sPattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher sMatcher = sPattern.matcher(password);

        boolean number = false;
        boolean upper_case = false;
        boolean lower_case = false;
        char check; //checks for all the strings if they are there

        for (int i = 0; i < password.length(); i++) {
            check = password.charAt(i);
            if (Character.isDigit(check)) {
                number = true;
            } else if (Character.isUpperCase(check)) {
                upper_case = true;
            } else if (Character.isLowerCase(check)) {
                lower_case = true;
            }
            else if(!sMatcher.matches())
            {
                return true;
                //System.out.println("No special character");
            }


            if (number && upper_case && lower_case) {
                logger.debug("Password is okay!");
                return true;
            }

        }
        //return false;
        //logger.debug("Password is okay!");
       // System.out.println("Password correct!!!"); //logger.debug
        return false;
    }

}