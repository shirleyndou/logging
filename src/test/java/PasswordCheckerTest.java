import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
* Testing whether the password has:
* No empty string
* No uppercase value
* No lowercase value
* No number in the password
* No special character in the password
* */

class PasswordCheckerTest {

    @Test
    public void passValidLength()
    {
        PasswordChecker charsLength = new PasswordChecker();
        boolean charsLength1 = charsLength.passwordIsOk("Abcde1#");
        assertTrue(charsLength1);
    }

    @Test
    public void passwordValidEmptyTest()
    {
        PasswordChecker passEmpty = new PasswordChecker();
        boolean empty = passEmpty.passwordIsOk("");
        assertFalse(empty);

    }

    @Test
    public void passwordValidUpperCaseTest()
    {
        PasswordChecker passUpperCase = new PasswordChecker();
        boolean upperCase = passUpperCase.passwordIsOk("abcdefghijklmnopqrstuvwxyz");
        assertFalse(upperCase);
    }

    @Test
    public void passwordValidLowerCaseTest()
    {
        PasswordChecker passLowerCase = new PasswordChecker();
        boolean lowerCase = passLowerCase.passwordIsOk("ABCDEFGGIJKLMNOPQRSTUVWXYZ");
        assertFalse(lowerCase);
    }

    @Test
    public void passwordValidNumberTest()
    {
        PasswordChecker passNumbers = new PasswordChecker();
        boolean number = passNumbers.passwordIsOk("Abcdef@");
        assertFalse(number);
    }

    @Test
    public void passwordValidSpecialCharsTest()
    {
        PasswordChecker specialChars = new PasswordChecker();
        boolean chars = specialChars.passwordIsOk("@!#$%&*");
        assertFalse(chars);
    }


}