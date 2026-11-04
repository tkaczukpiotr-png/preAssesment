package tests;

import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public abstract class BaseTest extends AbstractTestNGSpringContextTests {
    String baseUrl = "http://google.com"; // sample URL

    @BeforeMethod
    public void setUp() {
        open(baseUrl);
    }

    @AfterMethod(alwaysRun = true)
    public void cleanUp() {
        closeWebDriver();
    }
}