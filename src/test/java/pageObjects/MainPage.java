package pageObjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static helpers.TestData.engMainPageTitle;

public class MainPage {
    private SelenideElement lblMainPageTitle = $("h1.main-title");

    @Step("Verify that Main Page is displayed")
    public void verifyThatMainPageIsDisplayed() {
        lblMainPageTitle.shouldHave(text(engMainPageTitle));
    }
}