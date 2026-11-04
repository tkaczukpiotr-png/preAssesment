package pageObjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.id;

public class LoginPage {
    private SelenideElement inpUsername = $(id("username"));//to simplify the syntax
    private SelenideElement inpPassword = $(id("password"));
    private SelenideElement btnLogin = $(id("submit"));
    private SelenideElement lblSuccessfulLogin = $(id("successful-login-message"));//not attached to any element, just for example


    @Step("Enter username")//to report step in Allure report
    public void enterUsername(String username) {
        inpUsername.sendKeys(username);
    }

    @Step("Enter password")
    public void enterPassword(String password) {
        inpPassword.sendKeys(password);
    }

    @Step("Click on Login button")
    public void clickLoginButton() {
        btnLogin.click();
    }

    @Step("Verify that {0} message is displayed}")
    public void verifySuccessfulLoginMessage(String message) {
        lblSuccessfulLogin.shouldHave(text(message));
    }
}