package tests;

import base.BasicUiClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestingTask extends BasicUiClass {

    private static final String LOGIN_NAME = "alex.novitski.resume@gmail.com";
    private static final String PASSWORD = "Alex1978!";

    @Test
    public void loginSuccess() {
        new HomePage()
                .openLoginPage("/en")
                .clickOnLoginButton()
                .enterUserName(LOGIN_NAME)
                .enterPassword(PASSWORD)
                .clickOnSubmitButton()
                .assertEmailIsPresent(LOGIN_NAME);
    }

}
