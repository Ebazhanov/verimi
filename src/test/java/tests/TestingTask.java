package tests;

import base.BasicUiClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestingTask extends BasicUiClass {

    @Test
    public void loginSuccess() {
        new HomePage()
                .openLoginPage("/en")
                .clickOnLoginButton()
                .enterUserName("alex.novitski.resume@gmail.com")
                .enterPassword("Sonechka1978!")
                .clickOnSubmitButton()
                //.verifyFlashMessageText(flashMessage)
        ;
    }
}
