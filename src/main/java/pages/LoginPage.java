package pages;

import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class LoginPage {


    public static final String EMAIL_FIELD = "#usernameEntryField #emailField";
    public static final String PASSWORD_FIELD = "#passwordEntryField #passwordField";
    public static final String LOGIN_BUTTON = "#loginButton.primary";

    public LoginPage enterUserName(String loginName) {
        switchToNewTabOne();
        $(EMAIL_FIELD).waitUntil(visible, 2000).clear();
        $(EMAIL_FIELD).waitUntil(visible, 2000).setValue(loginName);
        return this;
    }

    private WebDriver switchToNewTabOne() {
        return switchTo().window(1);
    }

    public LoginPage enterPassword(String password) {
        $(PASSWORD_FIELD).waitUntil(visible, 2000).clear();
        $(PASSWORD_FIELD).waitUntil(visible, 2000).setValue(password);
        return this;
    }


    public LoginPage clickOnSubmitButton() {
        $(LOGIN_BUTTON).waitUntil(visible, 2000).click();
        return this;
    }


    public LoginPage verifyFlashMessageText(String messageText) {
        $("#flash").shouldHave(text(messageText));
        return this;
    }

}