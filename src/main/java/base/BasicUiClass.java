package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static utils.BrowserSelection.selectBrowser;

public class BasicUiClass {

    @BeforeMethod
    public void setBrowser() {
        baseUrl = "http://verimi.de";
        selectBrowser("Chrome");
        clearBrowserCache();
    }

    @AfterMethod
    void after() {
        clearBrowserCache();
        closeWebDriver();
    }

}