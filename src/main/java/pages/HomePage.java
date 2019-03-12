package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    public HomePage openLoginPage(String url) {
        open(url);
        return this;
    }

    public LoginPage clickOnLoginButton() {
        $(".btn.btn-green").click();
        return new LoginPage();
    }

}
