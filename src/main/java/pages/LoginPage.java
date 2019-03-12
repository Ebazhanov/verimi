package pages;

import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class LoginPage {

    private static final int EXPLICIT_WAIT = 9000;
    private static final String EMAIL_FIELD = "#usernameEntryField #emailField";
    private static final String PASSWORD_FIELD = "#passwordEntryField #passwordField";
    private static final String LOGIN_BUTTON = "#loginButton.primary";

    public LoginPage enterUserName(String loginName) {
        switchToNewTabOne();
        $(EMAIL_FIELD).waitUntil(visible, EXPLICIT_WAIT).clear();
        $(EMAIL_FIELD).waitUntil(visible, EXPLICIT_WAIT).setValue(loginName);
        return this;
    }

    private WebDriver switchToNewTabOne() {
        return switchTo().window(1);
    }

    public LoginPage enterPassword(String password) {
        $(PASSWORD_FIELD).waitUntil(visible, EXPLICIT_WAIT).clear();
        $(PASSWORD_FIELD).waitUntil(visible, EXPLICIT_WAIT).setValue(password);
        return this;
    }


    public LoginPage clickOnSubmitButton() {
        $(LOGIN_BUTTON).waitUntil(visible, EXPLICIT_WAIT).click();
        return this;
    }


    public LoginPage assertEmailIsPresent(String email) {
        $("#emailDetailRowData").waitUntil(visible, EXPLICIT_WAIT).shouldHave(text(email));
        return this;
    }

}