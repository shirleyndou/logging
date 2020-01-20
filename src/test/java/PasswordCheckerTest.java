import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    PasswordChecker passwordChecker =  new PasswordChecker();

    @Test
    void passwordIsValid() {
    /*Tests if all the conditions are met*/
        String password = "ahfghghg0000%$^&%$A";
        boolean check = passwordChecker.exist(password) &&
                passwordChecker.longer(password) &&
                passwordChecker.lowerCase(password) &&
                passwordChecker.upperCase(password) &&
                passwordChecker.digit(password) &&
                passwordChecker.character(password);
        assert(check);

    }

    /*@Test
    void passwordIsOk() {
        *//*Tests if at least 3 conditions are met
        * In this case, password exists, it has a lower and upper case character*//*
        String password = "aA";
        assert(passwordChecker.passwordIsOk(password));
    }*/
}