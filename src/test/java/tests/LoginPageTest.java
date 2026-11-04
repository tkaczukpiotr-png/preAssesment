package tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import config.TestConfig;
import pageObjects.MainPage;

import static helpers.TestData.*;

@ContextConfiguration(classes = TestConfig.class)
public class LoginPageTest extends BaseTest {

    @Autowired
    private LoginPage loginPage;//for better readability

    @Autowired
    private MainPage mainPage;

    @Test(testName = "Log in with valid credentials and verify that success message is displayed")//for allure reports
    public void p_loginWithValidCredentialsAndVerifySuccessMessage() {
        //naming convention: p_ = positive test case, n_ = negative test case
        loginPage.enterUsername(validEmail);
        loginPage.enterPassword(validPassword);
        loginPage.clickLoginButton();
        loginPage.verifySuccessfulLoginMessage(engSuccessMessage);
    }

    @Test(testName = "Log in with valid credentials and verify that main page is displayed")
    public void p_LoginWithValidCredentialsAndVerifyThatMainPageIsDisplayed() {
        loginPage.enterUsername(validEmail);
        loginPage.enterPassword(validPassword);
        loginPage.clickLoginButton();
        mainPage.verifyThatMainPageIsDisplayed();
    }

    @Test(testName = "Log in with incorrect email and verify that invalid email message is displayed")
    public void n_loginWithIncorrectEmailAndVerifyThatInvalidEmailMessageIsDisplayed() {
        loginPage.enterUsername(invalidEmail);
        loginPage.enterPassword(validPassword);
        loginPage.clickLoginButton();
        loginPage.verifySuccessfulLoginMessage(engInvalidEmail);
    }

    @Test(testName = "Log in with incorrect email and verify that correction message is displayed")
    public void n_loginWithIncorrectEmailAndCheckCorrectionMessage() {
        loginPage.enterUsername(invalidEmail);
        loginPage.enterPassword(validPassword);
        loginPage.clickLoginButton();
        loginPage.verifySuccessfulLoginMessage(engEnterCorrectEmail);
    }
}